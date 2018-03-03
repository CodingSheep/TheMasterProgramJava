package com.JarrodRaine.Classes.Misc;

import java.util.Scanner;
import com.JarrodRaine.Classes.Constants;

/**
 * @author Jarrod Raine
 */

public class MiscManager
{
	private static boolean runningHere = true;
	private static Scanner mM = new Scanner(System.in);
	private static String choice;
	
	public static void main() throws InterruptedException
	{
		boolean alreadySaid = false;
		do
		{
			if (!alreadySaid)
			{
				listPrograms();
				System.out.println("\nWhich program would you like to take a look at?");
				System.out.println("(Type \"Main Menu\" to go back)");
				alreadySaid = true;
			}
			
			System.out.print(">>");
			choice = mM.nextLine();
			System.out.println();
			
			inputReader();
		} while (runningHere);
	}
	
	private static void inputReader() throws InterruptedException
	{
		switch (choice.toLowerCase())
		{
		case "misc1":
			System.out.println("Loading Misc 1...");
			Misc1.filthBridge();
			System.out.println(Constants.finish);
			break;
		case "misc2":
			System.out.println("Loading Misc 2...");
			Misc2.targettedLevelChooser();
			System.out.println(Constants.finish);
			break;
		case "misc3":
			System.out.println("Loading Misc 3...");
			Misc3.arrayGames();
			System.out.println(Constants.finish);
			break;
		case "misc4":
			System.out.println("Loading Misc 4...");
			Misc4.randomBoard();
			break;
		case "main menu":
			runningHere = false;
			break;
		case "quit":
			runningHere = false;
			Constants.running = false;
			break;
		default:
			System.out.println("I dont understand that input");
			break;
		}
	}
	
	private static void listPrograms()
	{
		String[] projectList = {"Misc1", "Misc2", "Misc3"};		

		for(int i = 0; i < projectList.length; i++)
		{
			System.out.println((i + 1) + ": " + projectList[i]);
		}
	}
}