package com.JarrodRaine.Classes.CSC160.ClassProjects;

import java.util.Scanner;
import com.JarrodRaine.Classes.Constants;

/**
 * @author Jarrod Raine
 */

public class ProjectManager
{
	private static boolean runningHere = true;
	private static Scanner pM = new Scanner(System.in);
	private static String choice;
	
	public static void main() throws InterruptedException
	{
		boolean alreadySaid = false;
		do
		{
			if (!alreadySaid)
			{
				listPrograms();
				System.out.println("\nWhich project would you like to take a look at?");
				System.out.println("(Type \"CSC160 Menu\" to go back)");
				alreadySaid = true;
			}
			
			System.out.print(">>");
			choice = pM.nextLine();
			System.out.println();
			
			inputReader();
		} while (runningHere);
	}
	
	private static void inputReader() throws InterruptedException
	{
		switch (choice.toLowerCase())
		{
		case "project 1":
			ClassProject01.helloWorld();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 2":
			ClassProject02.info();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 3":
			ClassProject03.formats();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 4":
			ClassProject04.dialogBox();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 5":
			ClassProject05.counterControl();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 6":
			ClassProject06.alphabet();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 7":
			ClassProject07.alphabetLearn();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 8":
			ClassProject08.testScores();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 9":
			ClassProject09.main();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 10":
			ClassProject10.midterm();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 11":
			ClassProject11Part2.main();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 12":
			ClassProject12.main();
			System.out.println("\nProgram Project Finished");
			break;
		case "project 13":
			ClassProject13.main();
			System.out.println("\nProgram Project Finished");
			break;
		case "csc160 menu":
			runningHere = false;
			break;
		case "quit":
		case "exit":
			runningHere = false;
			Constants.running = false;
			System.out.println("Master Program Shutting Down...");
			break;
		default:
			System.out.println("I dont understand that input");
			break;
		}
	}
	
	private static void listPrograms()
	{
		String[] projectList = {"Project 1", "Project 2", "Project 3", "Project 4", "Project 5", "Project 6", "Project 7", "Project 8", "Project 9", "Project 10", "Project 11", "Project 12", "Project 13"};		

		for(int i = 0; i < projectList.length; i++)
		{
			if(i > 0 && i < 9)
				System.out.println((i + 1) + " | " + projectList[i]);
			else
				System.out.println((i + 1) + "| " + projectList[i]);
		}
	}
}
