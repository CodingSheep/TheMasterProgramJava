package com.JarrodRaine.Classes.CSC160.Assignments;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Jarrod Raine
 */

public class Assignments
{
	//Assignment 1-2 Static Variables
	private static Scanner a = new Scanner(System.in);																//Create Scanner to allow user to input into the console
	private static double bodyMassIndex;																			//The BMI will more than likely not be a whole number.
	private static double weightPounds;
	private static double heightMeters;
	private static final double TRANSLATETOKILOS = 0.45359237;
	private static String consoleName = "[Console]: "; 																//This is part of how I'll make the console output look nice
	
	//Assignment 3 Static Variables
	private static String firstNumString;
	private static String secondNumString;
	private static int firstNum = 0;
	private static int secondNum = 0;
	private static int bufferNum;
	private static int squaredNum;
	private static int evenSum;
	private static int[] array;
	private static int i; //For the Integer Array later on to help display all numbers between 1-10.
	private static boolean working = false;
	private static boolean whileLooper = true;
	
	public static void main() throws InterruptedException
	{
		boolean choiceBoolean = false;
		
		while (!choiceBoolean)
		{
			String choiceString = JOptionPane.showInputDialog(null, "Which of the following Methods would you like to see?:\nAssignment 1\nAssignment 2\nAssignment 3\nAssignment 5\nAssignment 6", "Assignments", JOptionPane.QUESTION_MESSAGE);
			
			switch (choiceString.toLowerCase())
			{
				case "assignment 1":
					Assignment1();
					choiceBoolean = true;
					break;
				case "assignment 2":
					JOptionPane.showMessageDialog(null, "Too bad, still doing Assignment 1 to do this.", "Assignments", JOptionPane.INFORMATION_MESSAGE);
					Assignment1();
					JOptionPane.showMessageDialog(null, "Now you may see Assignment 2", "Assignments", JOptionPane.INFORMATION_MESSAGE);
					Assignment2();
					choiceBoolean = true;
					break;
				case "assignment 3":
					Assignment3();
					choiceBoolean = true;
					break;
				case "assignment 5":
					Assignment5();
					choiceBoolean = true;
					break;
				case "assignment 6":
					Assignment6.main();
					choiceBoolean = true;
					break;
				case "exit":
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Im sorry, what?", "Assignments", JOptionPane.ERROR_MESSAGE);
			}
		}
		System.exit(0);
	}

	private static void Assignment1() throws InterruptedException
	{
		double weightKilos;
		double heightInches;
		double heightFeet;																					//I will note that the assignment DOES NOT ask the user to input how tall they are in feet,
		double heightRemainingInches;																		//  but I am deciding to add that feature in the output just for fun
		
		final double TRANSLATETOMETERS = 0.0254;
		
		System.out.println(consoleName + "Hello there! I am the Console. Can I ask how much you weigh? "
				+ "\n(Input your weight in pounds to the nearest tenth. Example: 135.6)");					//Asks for user's weight
		System.out.print(">>");
		weightPounds = a.nextDouble();																		//Gets user's weight in pounds
		
		System.out.println("\n" + consoleName + "Alright, and how tall are you in inches?");				//Asks for user's height
		System.out.print(">>");
		heightInches = a.nextInt();																		//Gets user's height in inches
		
		System.out.println("\n" + consoleName + "Calculating height in feet and inches...");
		heightRemainingInches = heightInches % 12;															//This is the part Im adding for fun: Calculating the user's height in feet and inches
		heightFeet = (heightInches - heightRemainingInches) / 12;											//The reason I calculated the remaining inches first was so I could subtract that from the
																											//  inches given (creating a number divisible by 12) so I could calculate the height in feet.
		Thread.sleep(1500);																					//Also, I used threads to give the impressing of the console taking time to process the information
		
		System.out.println(consoleName + "Calculating height in meters...");								//Inches to Meters Calculation
		heightMeters = heightInches * TRANSLATETOMETERS;
		Thread.sleep(1500);
		
		System.out.println(consoleName + "Calculating weight in kilograms...");								//Pounds to Kilograms calculation
		weightKilos = weightPounds * TRANSLATETOKILOS;
		Thread.sleep(1500);
		
		System.out.println(consoleName + "Calculating BMI...");												//BMI Calculation
		bodyMassIndex = weightKilos / (heightMeters * heightMeters);
		Thread.sleep(1500);
		
		System.out.println(consoleName + "Rounding numbers to nearest hundredth...\n");						//This is actually done in the Strings using Print Format, but this gives the impression of doing it
		Thread.sleep(1500);
		
		System.out.println(consoleName + "Alright, here are my results:");									//Now to print the results and the program is done!
		System.out.println(consoleName + "Height (Feet/Inches): " + (int)heightFeet + "\'" + (int)heightRemainingInches + "\"");
		System.out.println(consoleName + "Height (Inches): " + heightInches + "in.");
		System.out.printf(consoleName + "Height (Meters): %.2fm.\n", heightMeters);
		System.out.println(consoleName + "Weight (Pounds): " + weightPounds + "oz.");
		System.out.printf(consoleName + "Weight (Kilograms): %.2fkg\n", weightKilos);
		System.out.printf(consoleName + "BMI: %.1f\n", bodyMassIndex);
	}
	
	private static void Assignment2()
	{
		//Variables
		String BMIRoundedString;
		String weightMessage;
		String exerciseMessage = ""; //It's blank only to keep the system happy from potential compiling errors
		String targetWeightString;
		String weightChangeString;
		String newBMIString;
		double targetWeight;
		double BMIRounded;
		double weightChange;
		double newBMI;
		boolean gainWeight;
		
		final String exerciseString = "In the meantime, you can maintain your BMI by exercising. Might I suggest ";
		
		/*
		 * First of all, I changed the code. The Assignment1 method contains everything for Assignment 1.
		 * This method contains everything for Assignment 2.
		 * There are 3 things I should mention before looking at the code:
		 * 1) Knowing I need quite a few variables, I moved then outside the methods and made them static so all methods can use them.
		 * 2) As bodyMassIndex is rounded only through Print Format, it is still a long decimal value.
		 *    Therefore, I have to add a few lines of code to round it to the nearest tenth.
		 *    For proof, run the program when the System.out.print statement isn't behind "//".
		 * 3) I cut down on the amount of comments. I went overboard on them for Assignment 1, in my opinion.
		 */
		
		//System.out.println(bodyMassIndex);
		
		//This creates a string with the value of bodyMassIndex when rounded.
		//I then translate that to another double
		BMIRoundedString = String.format("%.1f", bodyMassIndex);
		BMIRounded = Double.valueOf(BMIRoundedString);
		
		//Nested If Statements (2.1)
		if (BMIRounded >= 30.0)
			weightMessage = "Obese";
		else
		{
			if (BMIRounded >= 25.0)
				weightMessage = "Overweight";
			else
			{
				if (BMIRounded >= 18.5)
					weightMessage = "Normal";
				else
					weightMessage = "Underweight";
			}
		}
		
		//Sequestial If Statements (2.2)
		//Far More Compact
		//Both Codes will give the same result
		if (BMIRounded >= 30.0)
			weightMessage = "Obese";
		if ((BMIRounded < 30.0) && (BMIRounded >= 25.0))
			weightMessage = "Overweight";
		if ((BMIRounded < 25.0) && (BMIRounded >= 18.5))
			weightMessage = "Normal";
		if (BMIRounded < 18.5)
			weightMessage = "Underweight";
		
		//Outputs weightMessage based on your BMI and gets user's target weight (As a String)
		JOptionPane.showMessageDialog(null, consoleName + "Since you have a BMI of " + BMIRounded + ", you are: " + weightMessage, "Assignment 2", JOptionPane.INFORMATION_MESSAGE);
		targetWeightString = JOptionPane.showInputDialog("What do you want your target weight to be? (In Pounds)");
		
		//Convert the String to a double. Or, to be accurate, turn the value of the string to a double.
		targetWeight = Double.valueOf(targetWeightString);
		
		//Tests to see if you are trying to gain weight or lose it
		gainWeight = (targetWeight > weightPounds) ? true : false;
		
		//Calculates weight change
		if (gainWeight)
			weightChange = targetWeight - weightPounds;
		else
			weightChange = weightPounds - targetWeight;
		
		//Rounds the weight change from a long decimal value (seen through testing) to the nearest tenth.
		weightChangeString = String.format("%.1f", weightChange);
		weightChange = Double.valueOf(weightChangeString);
		
		//Calculates what your BMI will become at your target weight goal (Not required but why not?)
		newBMI = (targetWeight * TRANSLATETOKILOS)/ (heightMeters * heightMeters);
		
		//Round newBMI
		newBMIString = String.format("%.1f", newBMI);
		newBMI = Double.valueOf(newBMIString);
		
		//Final If-Else statement
		if (gainWeight)
			JOptionPane.showMessageDialog(null, consoleName + "In that case, you need to gain " + weightChange + " pounds.\n" + consoleName + "This will bring your BMI to: " + newBMI, "Assignment 2", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, consoleName + "In that case, you need to lose " + weightChange + " pounds.\n" + consoleName + "This will bring your BMI to: " + newBMI, "Assignment 2", JOptionPane.INFORMATION_MESSAGE);
		
		//Finally, the switch statement to suggest exercises to do based on your BMI. The exerciseString final variable makes this easier to read.
		switch (weightMessage)
		{
			case "Underweight":
				exerciseMessage = "Strengthening Exercises?";
				break;
			case "Normal":
				exerciseMessage = "Aerobics?";
				break;
			case "Overweight":
			case "Obese":
				exerciseMessage = "Walking?";
				break;
		}
		
		JOptionPane.showMessageDialog(null, consoleName + exerciseString + exerciseMessage, "Assignment 2", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static void Assignment3()
	{
		/* Assignment 3 Main Comment
		 * 
		 * I am going to note first of all that a lot of the code is copied between the three methods.
		 * As such, I left little to no comments for the Do-While method as the only difference is that all While loops were
		 *   replaced with Do-While loops (As they are almost virtually the same when you think about it).
		 * Also, all variables are re-initialized in their respective methods as to keep some consistency between them.
		 * While on the subject of Variables, I made different methods for each exercise to keep it easy to read. As such,
		 *   I created them as static outside of the methods so all methods can access them. Then I split the variables
		 *   into groups to show which go with which assignments. Also, I changed the code so that the sum of all even
		 *   numbers between firstNum and secondNum (Inclusive) are displayed. Finally, I optimized the code a bit to cut
		 *   down on the bugs
		 *
		 *
		 * Assignment 4 Main Comment
		 * 
		 * The only real difference between this code and the code for Assignment 3 is that there's the options to choose
		 *   which method of Loops to do. Well that and fixing the aforementioned issue where I didn't display the sum
		 *   of all even numbers (Inclusive)
		 */
		
		//Just to make the compiler happy
		String a3Choice = null;
		
		//To help constantly loop until you make a choice
		boolean choice = false;
		
		//The Input Reader
		while(!choice)
		{
			//This string reads the user's input and reacts accordingly
			a3Choice = JOptionPane.showInputDialog(null, "Which Method would you like to use?\nWhile Loops\nFor Loops\nDo-While Loops\n\nType \"All\" to do all\nType \"Exit\" to quit.", "Assignment 3", JOptionPane.QUESTION_MESSAGE);
			
			//How the code tells which method to choose
			switch(a3Choice.toLowerCase())
			{
			case "while loops":
				//Exercise 9
				a3WhileLoops();
				choice = true;
				break;
			case "for loops":
				//Exercise 10 (For Loops)
				//This is the only other code with a good amount of comments as For Loops are a bit tricker to deal with.
				a3ForLoops();
				choice = true;
				break;
			case "do-while loops":
				//Exercise 11 (Do-While Loops)
				//Again, there are very few comments as all while loops were translated to do-while loops with no signifigant changes
				a3DoWhileLoops();
				choice = true;
				break;
			case "all":
				//Just in case you want to try them all
				a3WhileLoops();
				a3ForLoops();
				a3DoWhileLoops();
				choice = true;
				break;
			case "exit":
				//This will automatically shut down the program
				JOptionPane.showMessageDialog(null, "Shutting Down...", "Assignment 3", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Im sorry, what?", "Assignment 3", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}
	}
	
	private static void a3WhileLoops()
	{
		//Part A
		firstNumString = null;
		secondNumString = null;
		System.out.println("\nWhile Loop Method");
		while (firstNum >= secondNum || firstNumString == null || secondNumString == null || !working)
		{
			firstNumString = JOptionPane.showInputDialog(null, "Please input a first number.", "Assignment 3 (While Method)", JOptionPane.PLAIN_MESSAGE);
			secondNumString = JOptionPane.showInputDialog(null, "Now please a second number that's bigger than the first", "Assignment 3 (While Method)", JOptionPane.PLAIN_MESSAGE);
			
			try
			{
				working = true;
				firstNum = Integer.parseInt(firstNumString);
				secondNum = Integer.parseInt(secondNumString);
			}
			catch (NullPointerException e)
			{
				working = false;
				System.out.println("...Nice Try...");
			}
			catch (NumberFormatException e)
			{
				working = false;
				System.out.println("...Nice Try...");
			}
					
			if (firstNum >= secondNum)
				System.out.println("...Nice Try...");
		}
				
		//This will be re-initialized in the code when I re-make it for For and Do-WHile loops
		array = new int[(secondNum-firstNum) + 1];
		evenSum = 0;
				
		//Since working = true and I need to print even and odd numbers, I'm using a while loop under the working boolean.
		//Parts B and C
		while (working)
		{
			//Testing if firstNum is odd or not so I can output odd numbers first regardless as well as the even numbers afterwards.
			//As I am counting the odd/even numbers from the first number, I have to check to see if it's odd or not and adapt accordingly.
			//First Number is Odd.
			if (firstNum % 2 == 1)
			{
				bufferNum = firstNum;
				System.out.println("Odd Numbers (Inclusive):");
				squaredNum = 0;
				i = 0;
				while (bufferNum <= secondNum)
				{
					System.out.print(bufferNum + " ");
					squaredNum += Math.pow(bufferNum, 2);
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					bufferNum += 2;
				}
						
				bufferNum = firstNum + 1;
				System.out.println("\nEven Numbers (Inclusive):");
				i = 1;
				while (bufferNum <= secondNum)
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					evenSum += bufferNum;
					bufferNum += 2;
				}
				System.out.println("\nThe sum of all even numbers is: " + evenSum);
			}
			//First Number is Even
			else
			{
				bufferNum = firstNum + 1;
				System.out.println("Odd Numbers (Inclusive):");
				squaredNum = 0;
				i = 1;
				while (bufferNum <= secondNum)
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					squaredNum += Math.pow(bufferNum, 2);
					bufferNum += 2;
				}
						
				bufferNum = firstNum;
				System.out.println("\nEven Numbers (Inclusive):");
				i = 0;
				while (bufferNum <= secondNum)
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					evenSum += bufferNum;
					bufferNum += 2;
				}
				System.out.println("\nThe sum of all even numbers is: " + evenSum);
			}
					
			//Part D
			//Creates a new line so the console looks nice
			System.out.println("\nArray Squares Between 1 and 10");
			//Resets i so my array can display the numbers and their squares
			i = 0;
			//This displays the squares of all the numbers between 1 and 10 that are between
			//  and including firstNum and secondNum assuming they are also withing 1 and 10
			while (whileLooper)
			{
				System.out.println("The square of: " + array[i] + " is: " + Math.pow(array[i], 2));
				i++;
				//This if statement tests whether the value of i is greater than the amount of numbers (up to the number 10) than can be squared.
				//If this if statement is true, that means there are no more numbers to square.
				if (i > (10 - array[0]))
					whileLooper = false;
			}
			
			//This just does the same for 1-10
			System.out.println("\nAll Squares Between 1 and 10");
			i = 1;
			whileLooper = true;
			while (whileLooper)
			{
				System.out.println("The square of: " + i + " is: " + Math.pow(i, 2));
				i++;
				if (i > 10)
					whileLooper = false;
			}
					
			//Part E
			System.out.println("\nThe sum of all the squares of the odd numbers is: " + squaredNum);
			//Finally, since this loop is finished, time to exit it.
			working = false;
		}
		
		//Part F
		//This was a curveball, but Im assuming that by letters, you mean the Unicode letters.
		//So first is to create a variable that starts off the Uppercase Letters. In this case, 65 ('A' in unicode value)
		int unicode = 65;
		System.out.print("\nAlphabet (Uppercase): ");
		while (unicode < 91)
		{
			//Just to make it look nice in the console
			if (unicode < 90)
				System.out.print((char)unicode + " ");
			else
				System.out.print((char)unicode);
			unicode++;
		}
	}
	
	private static void a3ForLoops()
	{
		System.out.println("\n\nFor Loop Method:");
		/*This part here was the hardest to translate into a For loop as it's dependent on whether firstNum is less than secondNum.
		 *However, by using a false for loop where 'i' has absolutely no meaning, I solved this issue.
		 *The only way out is through the break statement.
		 *This was accomplished by giving you infinite tries to get it correct.
		 */
		firstNumString = null;
		secondNumString = null;
		for (;;)
		{
			firstNumString = JOptionPane.showInputDialog(null, "Please input a first number.", "Assignment 3 (For Loop Method)", JOptionPane.PLAIN_MESSAGE);
			secondNumString = JOptionPane.showInputDialog(null, "Now please a second number that's bigger than the first", "Assignment 3 (For Loop Method)", JOptionPane.PLAIN_MESSAGE);	
			
			try
			{
				firstNum = Integer.parseInt(firstNumString);
				secondNum = Integer.parseInt(secondNumString);
			}
			catch (NullPointerException e)
			{
				System.out.println("...Nice Try...");
			}
			catch (NumberFormatException e)
			{
				System.out.println("...Nice Try...");
			}
			
			if (firstNum < secondNum)
				if (firstNumString != null && secondNumString != null)
					break;
			else
				System.out.println("...Nice Try...");
		}
		
		array = new int[(secondNum-firstNum) + 1];
		evenSum = 0;
		
		//Only one loop!
		//Also, used variable 'j' since I already have a variable called 'i'
		for (int j = 0; j < 1; j++)
		{
			if (firstNum % 2 == 1)
			{
				System.out.println("Odd Numbers (Inclusive):");
				squaredNum = 0;
				i = 0;
				for (bufferNum = firstNum; bufferNum <= secondNum; bufferNum += 2)
				{
					System.out.print(bufferNum + " ");
					squaredNum += Math.pow(bufferNum, 2);
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
				}
				
				System.out.println("\nEven Numbers (Inclusive):");
				i = 1;
				for (bufferNum = firstNum + 1; bufferNum <= secondNum; bufferNum +=2)
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					evenSum += bufferNum;
				}
				System.out.println("\nThe sum of all even numbers is: " + evenSum);
			}
			else
			{
				System.out.println("Odd Numbers (Inclusive):");
				squaredNum = 0;
				i = 1;
				for (bufferNum = firstNum + 1; bufferNum <= secondNum; bufferNum += 2)
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					squaredNum += Math.pow(bufferNum, 2);
				}
				
				System.out.println("\nEven Numbers (Inclusive):");
				i = 0;
				for (bufferNum = firstNum; bufferNum <= secondNum; bufferNum += 2)
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					evenSum += bufferNum;
				}
				System.out.println("\nThe sum of all even numbers is: " + evenSum);
			}
			
			System.out.println("\nArray Squares Between 1 and 10");
			//Had to use 'k' here since I'm still using 'j'. Also, 'i' doesn't work as that was initialized before.
			//This is the same as the while loop that takes the numbers (inclusive) between
			//  firstNum and secondNum that are between 1 and 10 (inclusive)
			for (int k = 0; k < array.length; k++)
			{
				//This if statement tests whether the value of k is greater than the amount of numbers (up to the number 10) than can be squared.
				//If this if statement is true, that means there are no more numbers to square.
				if (k > (10 - array[0]))
					break;
				System.out.println("The square of: " + array[k] + " is: " + Math.pow(array[k], 2));
			}
			
			//Now for the normal squares for 1-10
			System.out.println("\nAll Squares Between 1 and 10");
			for (int k = 1; k < 11; k++)
			{
				System.out.println("The square of: " + k + " is: " + Math.pow(k, 2));
			}
			
			System.out.println("\nThe sum of all the squares of the odd numbers is: " + squaredNum);
		}
		
		//Something I'm hoping you've noticed by now is that a lot of the for loops are just condensed while loops.
		//When I saw that I was creating variables and conditions that work perfectly in For loops, making them became
		//  simpler. In fact, the forLoops() method is the shortest of the three.
		System.out.print("\nAlphabet (Uppercase): ");
		for (int unicode = 65; unicode < 91; unicode++)
		{
			if (unicode < 90)
				System.out.print((char)unicode + " ");
			else
				System.out.print((char)unicode);
		}
	}
	
	private static void a3DoWhileLoops()
	{
		System.out.println("\n\nDo-While Loop Method:");
		firstNumString = null;
		secondNumString = null;
		do
		{
			firstNumString = JOptionPane.showInputDialog(null, "Please input a first number.", "Assignment 3 (Do-While Loop Method)", JOptionPane.PLAIN_MESSAGE);
			secondNumString = JOptionPane.showInputDialog(null, "Now please a second number that's bigger than the first", "Assignment 3 (Do-While Loop Method)", JOptionPane.PLAIN_MESSAGE);
			
			try
			{
				firstNum = Integer.parseInt(firstNumString);
				secondNum = Integer.parseInt(secondNumString);
			}
			catch (NullPointerException e)
			{
				System.out.println("...Nice Try...");
			}
			catch (NumberFormatException e)
			{
				System.out.println("...Nice Try...");
			}
		} while (firstNum >= secondNum || firstNumString == null || secondNumString == null);
		
		array = new int[(secondNum-firstNum) + 1];
		evenSum = 0;
		
		do
		{
			if (firstNum % 2 == 1)
			{
				bufferNum = firstNum;
				System.out.println("Odd Numbers (Inclusive):");
				squaredNum = 0;
				i = 0;
				do
				{
					System.out.print(bufferNum + " ");
					squaredNum += Math.pow(bufferNum, 2);
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					bufferNum += 2;
				} while (bufferNum <= secondNum);
				
				bufferNum = firstNum + 1;
				System.out.println("\nEven Numbers (Inclusive):");
				i = 1;
				do
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					evenSum += bufferNum;
					bufferNum += 2;
				} while (bufferNum <= secondNum);
				System.out.println("\nThe sum of all even numbers is: " + evenSum);
			}
			else
			{
				bufferNum = firstNum + 1;
				System.out.println("Odd Numbers (Inclusive):");
				squaredNum = 0;
				i = 1;
				do
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					squaredNum += Math.pow(bufferNum, 2);
					bufferNum += 2;
				} while (bufferNum <= secondNum);
				
				bufferNum = firstNum;
				System.out.println("\nEven Numbers (Inclusive):");
				i = 0;
				do
				{
					System.out.print(bufferNum + " ");
					if (bufferNum <= 10 && bufferNum >= 1)
					{
						array[i] = bufferNum;
						i += 2;
					}
					evenSum += 2;
					bufferNum += 2;
				} while (bufferNum <= secondNum);
				System.out.println("\nThe sum of all even numbers is: " + evenSum);
			}
			
			System.out.println("\nArray Squares Between 1 and 10");
			i = 0;
			whileLooper = true;
			do
			{
				System.out.println("The square of: " + array[i] + " is: " + Math.pow(array[i], 2));
				i++;
				if (i > (secondNum - firstNum) || i > (10 - array[0]))
					whileLooper = false;
			} while (whileLooper);
			
			System.out.println("\nAll Squares Between 1 and 10");
			i = 1;
			whileLooper = true;
			do
			{
				System.out.println("The square of: " + i + " is: " + Math.pow(i, 2));
				i++;
				if (i > 10)
					whileLooper = false;
			} while (whileLooper);
			
			System.out.println("\nThe sum of all the squares of the odd numbers is: " + squaredNum);
			working = false;
		} while (working);
		
		System.out.print("\nAlphabet (Uppercase): ");
		int unicode = 65;
		do
		{
			//Just to make it look nice in the console
			if (unicode < 90)
				System.out.print((char)unicode + " ");
			else
				System.out.print((char)unicode);
			unicode++;
		} while (unicode < 91);
	}
	
	public static void Assignment5()
	{
		//Initiates Tester Class "PhoneTester"
		PhoneTester.main();
	}
}