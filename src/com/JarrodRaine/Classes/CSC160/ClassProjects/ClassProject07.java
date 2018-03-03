package com.JarrodRaine.Classes.CSC160.ClassProjects;

/**
 * @author Jarrod Raine
 * @author Joseph Leavitt
 */

import java.util.Scanner;
import com.JarrodRaine.Classes.Constants;

public class ClassProject07
{
	static Scanner p8 = new Scanner(System.in);
	public static void alphabetLearn()
	{
		//Variable
		String letterString = "A";
		char letter;
		
		//Code
		System.out.println(Constants.consoleName + "Let's learn the ABCs!");
		System.out.println(Constants.consoleName + "Enter the letters in order!");
		
		//Only One Loop!
		for (char i = 'A'; i <= 'Z'; i++)
		{
			//This basically just takes in user input through the console.
			System.out.print(">>");
			letterString = p8.next();
			letterString = letterString.toUpperCase();
			letter = letterString.charAt(0);
			
			//This tests whether or not you typed in the right letter (regardless of case)
			if (letter == i)
			{
				System.out.println("Next:");
			}
			else
			{
				i = (char)64;
				System.out.println(Constants.consoleName + "You got it wrong! Time to restart the entire lesson.");
				System.out.println(Constants.consoleName + "Enter the letters in order this time.");
			}
		}
		//This only shows when you successfully type in the full alphabet
		System.out.println(Constants.consoleName + "Congrats. You know the alphabet");
	}
}
