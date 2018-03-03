package com.JarrodRaine.Classes.CSC160.ClassProjects;

import com.JarrodRaine.Classes.Constants;
import javax.swing.JOptionPane;

/**
 * @author Jarrod Raine
 */

public class ClassProject04
{
	static String birthday;
	static String monthString;
	static String dayString;
	static String yearString;
	static String nextMonthString;
	
	static int intTester;
	static int monthInt;
	static int dayInt;
	static int yearInt;
	static int daysInMonth;
	
	static boolean leapYear;
	
	public static void dialogBox()
	{
		boolean itWorks = true;
		
		birthday = JOptionPane.showInputDialog(Constants.consoleName + "May I ask when your birthday is? (MM/DD/YYYY)");
		birthday = birthday.replace("/", "");
		do
		{
			while (birthday.length() > 10 || !itWorks)
			{
				birthday = JOptionPane.showInputDialog(Constants.consoleName + "Seriously, when is your birthday? (MM/DD/YYYY)");
				birthday.replace("/", "");
			}
			try
			{
				itWorks = true;
				intTester = Integer.parseInt(birthday); //Tests that the reduced string can successfully become an int
			}
			catch (NumberFormatException e)
			{
				itWorks = false;
				System.out.println("...Try Again...");
			}
			catch (NullPointerException e)
			{
				itWorks = false;
				System.out.println("...Try Again...");
			}
		} while (!itWorks);
		birthday = Integer.toString(intTester);
		
		birthdayCalc();
		nextCalc();
		
		if (leapYear)
			JOptionPane.showMessageDialog(null,Constants.consoleName + "Your Birthday is: " + monthString + " " + dayString + ", " + yearString + ". It's on a leap year!", "Program 4", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,Constants.consoleName + "Your Birthday is: " + monthString + " " + dayString + ", " + yearString + ". It's not on a leap year...", "Program 4", JOptionPane.INFORMATION_MESSAGE);
		
		if (dayInt == 1)
			JOptionPane.showMessageDialog(null,Constants.consoleName + "The next Calendar Month is " + nextMonthString + " " + dayString + ", " + yearString + "\n" + Constants.consoleName + "The next Calendar Day is " + nextMonthString + " " + dayInt + ", " + yearString + "\n" + Constants.consoleName + "The next Calendar Year is " + monthString + " " + dayString + ", " + (yearInt + 1), "Program 4", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,Constants.consoleName + "The next Calendar Month is " + nextMonthString + " " + dayString + ", " + yearString + "\n" + Constants.consoleName + "The next Calendar Day is " + monthString + " " + dayInt + ", " + yearString + "\n" + Constants.consoleName + "The next Calendar Year is " + monthString + " " + dayString + ", " + (yearInt + 1), "Program 4", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static void birthdayCalc()
	{
		char monthChar;
		char dayChar;
		
		switch (birthday.length())
		{
			case 6:
				monthChar = birthday.charAt(0);
				monthString = String.valueOf(monthChar);
				monthInt = Integer.parseInt(monthString);
				dayChar = birthday.charAt(1);
				dayString = String.valueOf(dayChar);
				yearString = birthday.substring(2);
				break;
			case 7:
				monthChar = birthday.charAt(0);
				monthString = String.valueOf(monthChar);
				monthInt = Integer.parseInt(monthString);
				dayString = birthday.substring(1, 3);
				yearString = birthday.substring(3);
				break;
			case 8:
				monthString = birthday.substring(0, 2);
				monthInt = Integer.parseInt(monthString);
				dayString = birthday.substring(2, 4);
				yearString = birthday.substring(4);
				break;
		}
		
		switch (monthString)
		{
			case "1":
				monthString = "January";
				break;
			case "2":
				monthString = "February";
				break;
			case "3":
				monthString = "March";
				break;
			case "4":
				monthString = "April";
				break;
			case "5":
				monthString = "May";
				break;
			case "6":
				monthString = "June";
				break;
			case "7":
				monthString = "July";
				break;
			case "8":
				monthString = "August";
				break;
			case "9":
				monthString = "September";
				break;
			case "10":
				monthString = "October";
				break;
			case "11":
				monthString = "November";
				break;
			case "12":
				monthString = "December";
				break;
			default:
				break;
		}
	}
	
	private static void nextCalc()
	{
		dayInt = Integer.parseInt(dayString);
		yearInt = Integer.parseInt(yearString);
		
		if (yearInt % 4 == 0)
			leapYear = true;
		else
			leapYear = false;
		
		switch (monthInt)
		{
			case 1:
				nextMonthString = "February";
				break;
			case 2:
				nextMonthString = "March";
				break;
			case 3:
				nextMonthString = "April";
				break;
			case 4:
				nextMonthString = "May";
				break;
			case 5:
				nextMonthString = "June";
				break;
			case 6:
				nextMonthString = "July";
				break;
			case 7:
				nextMonthString = "August";
				break;
			case 8:
				nextMonthString = "September";
				break;
			case 9:
				nextMonthString = "October";
				break;
			case 10:
				nextMonthString = "November";
				break;
			case 11:
				nextMonthString = "December";
				break;
			case 12:
				nextMonthString = "January";
				break;
			default:
				break;
		}
		switch (monthInt)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				daysInMonth = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				daysInMonth = 30;
			case 2:
				if (leapYear)
					daysInMonth = 29;
				else
					daysInMonth = 28;
			default:
				break;
		}
		
		dayInt++;
		if (dayInt > daysInMonth)
			dayInt = 1;
	}
}