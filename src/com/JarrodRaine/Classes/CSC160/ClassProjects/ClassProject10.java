package com.JarrodRaine.Classes.CSC160.ClassProjects;

import java.util.Scanner;

/**
 * Midterm Program
 * @author Jarrod Raine
 */

public class ClassProject10
{
	static Scanner console = new Scanner(System.in);
	
	public static void midterm()
	{
		int number;
		
		System.out.println("Enter a number");
		//Use the Scanner to take the number from the user.
		number = console.nextInt();
      
		System.out.println("I am going to double the number for you:");
		//Display the number doubled using the Math class.
		System.out.println(Math.pow(number, 2));
		
		System.out.println("Now, we will see if the number is prime or not");
      
		/*Call the method prime which you will develop below on number and if it returns true*/
		if(isPrime(number)) 
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number");
	}
      
      
	//Develop a method prime which will take as a parameter an integer number and returns back true or false if the number is prime or not.
	//A prime number is a number that is greater than 1 and is divisible by 1 and itself only. Example, 3 , 5, 13, etc.
	//Use a for loop that will go from 1 to the number, the loop should check if the number is divisible by any number other than 1.
	//If that is the case it returns false, otherwise it returns true.
	//This method will be called from main.
	
	private static boolean isPrime(int num)
	{
		for (int i = 1; i < num; i++)
		{
			if((double)num % i == 0 && i != 1)
				return false;
		}
		return true;
	}

}
