package com.JarrodRaine.Classes.CSC160.ClassProjects;

import java.util.Scanner;

/**
 * @author Jarrod Raine
 */

public class ClassProject08
{
	private static double test1, test2, test3;
	private static double avg;
	private static long choiceNum;
	private static Scanner p9 = new Scanner(System.in);
	
	public static void testScores()
	{
		inputReader();
		switch ((int)choiceNum)
		{
		case 2:
			display(averageCalc(test1, test2));
			break;
		case 3:
			display(averageCalc(test1, test2, test3));
			break;
		default:
			System.out.println();
			break;
		}
	}
	
	private static void display(double avg)
	{
		System.out.println("\nScores:");
		System.out.println("Test 1: " + test1);
		System.out.println("Test 2: " + test2);
		if (choiceNum == 3)
			System.out.println("Test 3: " + test3);
		System.out.println("Average: " + avg);
		System.out.println("Grade: " + findGrade(avg));
		System.out.println("Grade Statement: " + gradeStatement(findGrade(avg)));
	}
	
	private static void inputReader()
	{
		do
		{
			System.out.println("Will you be inputting 2 or 3 test scores?");
			System.out.print(">>");
			choiceNum = p9.nextLong();
			System.out.println();
		} while (choiceNum != 2 && choiceNum != 3);
		
		do
		{
			System.out.println("Please enter the first test score:");
			System.out.print(">>");
			test1 = p9.nextDouble();
		} while (test1 < 0 && test1 > 100);
		
		do
		{
			System.out.println("\nPlease enter the second test score:");
			System.out.print(">>");
			test2 = p9.nextDouble();
		} while (test2 > 100 && test2 < 0);
		
		if (choiceNum == 3)
			do
			{
				System.out.println("\nPlease enter the third test score:");
				System.out.print(">>");
				test3 = p9.nextDouble();
			} while (test3 > 100 && test3 < 0);
	}
	
	private static char findGrade(double avg)
	{
		if (avg >= 60)
			if (avg >= 70)
				if (avg >= 80)
					if (avg >= 90)
						return 'A';
					else
						return 'B';
				else
					return 'C';
			else
				return 'D';
		else
			return 'F';
	}
	
	private static double averageCalc(double num1, double num2)
	{
		return (num1 + num2) / 2;
	}
	
	private static double averageCalc(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3) / 3;
	}
	
	private static String gradeStatement(char Char)
	{
		switch (findGrade(avg))
		{
		case 'A':
			return "You are a Certified Genius!";
		case 'B':
			return "You're doing well!";
		case 'C':
			return "At least you passed...";
		case 'D':
			return "Might need to work a bit harder next time";
		case 'F':
			return "Better luck next time";
		default:
			return "How did you break the program?";
		}
	}
}