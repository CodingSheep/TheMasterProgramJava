package com.JarrodRaine.Classes;

import java.util.Scanner;
import javax.swing.*;

import com.JarrodRaine.Classes.CSC126.CSC126Manager;
import com.JarrodRaine.Classes.CSC160.CSC160Manager;
import com.JarrodRaine.Classes.Misc.MiscManager;

/**
 * @author Jarrod Raine
 * @version 1.2.9
 */

public class Main
{
	private static Scanner in = new Scanner(System.in);
	private static boolean dev = false;
	private static String input;
	
	public static void main(String[] args) throws InterruptedException
	{
		boolean alreadySaid = false;
		do
		{
			if (!alreadySaid)
			{
				System.out.println("This is Jarrod Raine's \"Master Program\"!");
				System.out.println("Please choose from the following list which programs you'd like to take a look at:\n");
				listPrograms();
				System.out.println("\nIf you need some help with the commands, please type \"Help\"");
				System.out.println("If you want to quit the program, just type \"Quit\"");
				alreadySaid = true;
			}
			
			System.out.print(">>");
			input = in.nextLine();
			System.out.println();
			
			inputReader();
		} while (Constants.running);
	}
	
	private static void inputReader() throws InterruptedException
	{
		switch(input.toLowerCase())
		{
		case "csc160":
			System.out.println("Loading CSC160 Class Manager...");
			CSC160Manager.main();
			if (Constants.running)
				System.out.println("Welcome back to the Main Menu");
			break;
		case "csc126":
			System.out.println("Loading CSC126 Class Manager...");
			CSC126Manager.main();
			if (Constants.running)
				System.out.println("Welcome back to the Main Menu");
			break;
		case "misc":
			System.out.println("Loading Misc Manager...");
			MiscManager.main();
			if (Constants.running)
				System.out.println("Welcome back to the Main Menu");
			break;
		case "changelog":
			System.out.println("Loading Changelog.txt...");
			Constants.changelog();
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
		case "help":
			listCommands();
			break;
		case "hidden message":
			JOptionPane.showMessageDialog(null, "You found the secret message. I'm impressed!", "Hidden Message", JOptionPane.PLAIN_MESSAGE);
			break;
		case "information":
			System.out.println("Retrieving Information...");
			Constants.information();
			break;
		case "list programs":
			System.out.println("Listing Programs...");
			listPrograms();
			break;
		case "quit":
		case "exit":
			System.out.print("Shutting Down...");
			Constants.running = false;
			break;
		default:
			System.out.println("I don't recognize that input.");
			break;
		}
	}
	
	private static void listCommands()
	{
		String[] commandList = {"Changelog", "Dev", "Help", "Information", "List Commands", "List Programs", "Quit"};
		
		System.out.println("\nCommands:");
		for(int i = 0; i < commandList.length; i++)
		{
			System.out.println("| " + commandList[i]);
		}
	}
	
	private static void listPrograms()
	{
		String[] programList = {"CSC160", "CSC126", "Misc"};

		for(int i = 0; i < programList.length; i++)
		{
			System.out.println((i + 1) + "| " + programList[i]);
		}
	}	
}