package com.JarrodRaine.Classes.CSC160.ClassProjects;

import java.util.Scanner;
import com.JarrodRaine.Classes.Constants;

/**
 * @author Jarrod Raine
 */

public class ClassProject02
{
	static int creditsTaken;
	static int creditsNeeded;
	static int creditsLeft;
	static int semestersLeft;
	final static int fullTimeCredits = 15;
	static Scanner p2 = new Scanner(System.in);
	
	public static void info()
	{
		basicInfo();
		creditCalc();
	}
	
	private static void basicInfo()
	{
		String name;
		double age;
		int yearBorn;
		String major;
		
		System.out.println(Constants.consoleName + "What is your name?");
		System.out.print(">>");
		
		name = p2.nextLine();
		
		System.out.println();
		System.out.println(Constants.consoleName + "Hello, " + name + "!");
		System.out.println(Constants.consoleName + "What is your age (in years)?");
		System.out.print(">>");
		
		age = p2.nextDouble();
		
		System.out.println();
		System.out.println(Constants.consoleName + "You are " + age + " years old.");
		System.out.println(Constants.consoleName + "What year were you born?");
		System.out.print(">>");
		
		yearBorn = p2.nextInt();
		
		System.out.println();
		System.out.println(Constants.consoleName + "You were born in " + yearBorn + ".");
		System.out.println(Constants.consoleName + "What is your Major? (Mathmatics, Arts, etc)");
		System.out.print(">>");
		
		major = p2.next();
		
		System.out.println("\n");
		System.out.println(Constants.consoleName + "You are going for a degree in " + major + ".");
	}
	
	private static void creditCalc()
	{
		boolean itWorks = true;
		
		System.out.println(Constants.consoleName + "How many credit hours are required for your degree?");
		System.out.print(">>");
		
		creditsNeeded = p2.nextInt();
		
		System.out.println();
		do
		{
			System.out.println(Constants.consoleName + "How many credit hours did you complete? (Include this semester)");
			System.out.print(">>");
		
			creditsTaken = p2.nextInt();
			System.out.println();
			
			if (creditsTaken > creditsNeeded)
			{
				System.out.println(Constants.consoleName + "No seriously...");
				itWorks = false;
			}
			else
			{
				itWorks = true;
			}
		} while (!itWorks);
		
		System.out.println(Constants.consoleName + "Calculating remaining credits and minimum amount of semesters needed...");
		
		creditsLeft = creditsNeeded - creditsTaken;			//Calculates Remaining Credits
		semestersLeft = creditsLeft / fullTimeCredits;		//Calculates Remaining Semesters
		if (creditsLeft % fullTimeCredits != 0)				//Adds one semester if there are any remaining credits
			++semestersLeft;
		
		System.out.println(Constants.consoleName + "Assuming you are taking 15 credit hours per semester as a full time student...");
		System.out.println(Constants.consoleName + "You have " + creditsLeft + " credit hours left. This means that you have a minimum of " + semestersLeft + " semesters left.");
	}
}