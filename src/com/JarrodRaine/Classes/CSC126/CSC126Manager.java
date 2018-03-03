package com.JarrodRaine.Classes.CSC126;

import java.util.Scanner;
import com.JarrodRaine.Classes.Constants;

/**
 * @author Jarrod Raine
 */

public class CSC126Manager
{
	private static boolean runningHere = true;
	private static String input;
	
	private static Scanner csc126M = new Scanner(System.in);
	
	public static void main()
	{
		boolean alreadySaid = false;
		do
		{
			if (!alreadySaid)
			{
				listPrograms();
				System.out.println("\nWhich section would you like to take a look at?");
				System.out.println("(Type \"Main Menu\" to go back)");
				System.out.println("(Type \"Quit\" or \"Exit\" to quit the program)");
				alreadySaid = true;
			}
			
			System.out.print(">>");
			input = csc126M.nextLine();
			System.out.println();
			
			inputReader();
		} while (runningHere && Constants.running);
	}
	
	private static void inputReader()
	{
		switch(input.toLowerCase())
		{
		case "games":
			System.out.println("No Games today");
			if (Constants.running)
				System.out.println("Welcome back to the CSC126 Menu");
			break;
		case "help":
			listCommands();
			break;
		case "main menu":
			runningHere = false;
			break;
		case "quit":
		case "exit":
			runningHere = false;
			Constants.running = false;
			break;
		default:
			System.out.println("I don't recognize that input.");
			break;
		}
	}
	
	private static void listCommands()
	{
		String[] commandList = {"Games", "Help", "Main Menu", "Quit"};
		
		System.out.println("\nCommands:");
		for(int i = 0; i < commandList.length; i++)
		{
			System.out.println("| " + commandList[i]);
		}
	}
	
	private static void listPrograms()
	{
		String[] programList = {};		

		for(int i = 0; i < programList.length; i++)
		{
			System.out.println((i + 1) + "| " + programList[i]);
		}
	}
}
