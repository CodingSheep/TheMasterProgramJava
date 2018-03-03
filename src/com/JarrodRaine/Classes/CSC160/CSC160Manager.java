package com.JarrodRaine.Classes.CSC160;

import java.util.Scanner;
import com.JarrodRaine.Classes.Constants;
import com.JarrodRaine.Classes.CSC160.Assignments.Assignments;
import com.JarrodRaine.Classes.CSC160.ClassProjects.ProjectManager;

/**
 * @author Jarrod Raine
 */

public class CSC160Manager
{
	private static boolean runningHere = true;
	private static boolean dev = false;
	private static String input;
	
	private static Scanner csc160M = new Scanner(System.in);
	
	public static void main() throws InterruptedException
	{
		boolean alreadySaid = false;
		do
		{
			if (!alreadySaid)
			{
				listPrograms();
				System.out.println("\nWhich section would you like to take a look at?");
				System.out.println("(Type \"Main Menu\" to go back)");
				System.out.println("(Type \"Quit\" or \"Exit\" to go back)");
				alreadySaid = true;
			}
			
			System.out.print(">>");
			input = csc160M.nextLine();
			System.out.println();
			
			inputReader();
		} while (runningHere && Constants.running);
	}
	
	private static void inputReader() throws InterruptedException
	{
		switch(input.toLowerCase())
		{
		case "projects":
			System.out.println("Loading Program Manager...");
			ProjectManager.main();
			if (Constants.running)
				System.out.println("Welcome back to the CSC160 Main Menu");
			break;
		case "assignments":
			System.out.println("Note: This WILL close the Master Program after it's done.");
			System.out.println("Loading Assignments...");
			Assignments.main();
			break;
		case "dev":
			if (dev)
			{
				System.out.println("Loading Dev Program...");
				//Put Dev programs here:
				System.out.println(Constants.finish);
			}
			else
				System.out.println("There are currently no dev programs in this version.");
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
	
	private static void listPrograms()
	{
		String[] programList = {"Projects", "Assignments"};		

		for(int i = 0; i < programList.length; i++)
		{
			System.out.println((i + 1) + "| " + programList[i]);
		}
	}
}
