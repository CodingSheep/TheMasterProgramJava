package com.JarrodRaine.Classes.CSC160.ClassProjects;

import java.util.Scanner;

/**
 * @author Jarrod Raine
 * @author Joseph Leavitt
 */

public class ClassProject09
{
	static Scanner p10 = new Scanner(System.in);
	
	static int monthValue;
	static int dayValue;
	static int yearValue;
	
	public static void main()
	{
		//Just for the If statements and Do-While Loops
		int realDays;
		int numChoice;
		
		//Takes a Year Value (Cannot be 0 or less)
		do
		{
			System.out.println("What is the numeric value of the year?");
			System.out.print(">>");
			yearValue = p10.nextInt();
			System.out.println();
		} while (yearValue < 1);
		
		//Tests the Month Value and makes sure it's a valid month
		do
		{
			System.out.println("What is the numeric value of the month?");
			System.out.print(">>");
			monthValue = p10.nextInt();
			System.out.println();
		} while (monthValue < 1 || monthValue > 12);
		
		realDays = monthDays(monthValue);
		
		//Tests the Day Value and makes sure it's a valid day based on the month you entered
		do
		{
			System.out.println("What is the numeric value of the day?");
			System.out.print(">>");
			dayValue = p10.nextInt();
			System.out.println();
		} while (dayValue <= 0 || dayValue > realDays);
		
		//Asks the user how they want the date displayed
		do
		{
			System.out.println("Would you like it displayed as digits (1), have the month name (2), or run both (3)?");
			System.out.print(">>");
			numChoice = p10.nextInt();
			System.out.println();
		} while (numChoice < 1 || numChoice > 3);
		
		//Displays date based on user choice
		if(numChoice == 1)
			displayDate(monthValue, dayValue, yearValue);
		if(numChoice == 2)
			displayDate(monthName(monthValue), dayValue, yearValue);
		if(numChoice == 3)
		{
			displayDate(monthValue, dayValue, yearValue);
			displayDate(monthName(monthValue), dayValue, yearValue);
		}
	}
	
	//Displays date with month value
	private static void displayDate(int num1, int num2, int num3)
	{
		System.out.println(num1 + "/" + num2 + "/" + num3);
	}
	
	//Displays date with month string
	private static void displayDate(String string1, int num2, int num3)
	{
		System.out.println(string1 + " " + num2 + ", " + num3);
	}
	
	//Tests the yearValue to check if it's a leap year
	private static boolean leapYear(int year)
	{
		if(year % 4 == 0 && year % 100 != 0)
			return true;
		else
			return false;
	}
	
	//Used to find how many days there are in any specific month based on the month value
	private static int monthDays(int num)
	{
		switch(num)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if(leapYear(yearValue))
				return 29;
			else
				return 28;
		default:
			return 0;
		}
	}
	
	//Gets the month name based on the month value
	
	private static String monthName(int num)
	{
		switch(num)
		{
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "I am Error";
		}
	}
}