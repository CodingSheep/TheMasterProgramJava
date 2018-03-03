package com.JarrodRaine.Classes.CSC160.ClassProjects;

import javax.swing.JOptionPane;

/**
 * @author Jarrod Raine
 */

public class ClassProject05
{
	public static void counterControl()
	{
		//Variables
		int random = (int)(Math.random() * 100);
		int userGuessNumber;
		int counter = 0;
		String userGuess = "";
		String activateCounter;
		String counterString = "";
		boolean counterControl = false;
		
		//Code
		activateCounter = JOptionPane.showInputDialog(null, "Would you like to have a set amount of tries for this program? (\"Yes\" or \"No\")", "Program 5", JOptionPane.QUESTION_MESSAGE);
		switch (activateCounter.toLowerCase())
		{
		case "yes":
			counterControl = true;
			counter = 7;
			counterString = "(" + counter + " guesses left)";
			break;
		case "no":
			counterControl = false;
			break;
		}
		
		userGuess = JOptionPane.showInputDialog(null, "Welcome to the Counter Controlled Guessing Game!\nI have already randomly selected a number between 1 and 100!\nWhat do you think it is? " + counterString, "Program 5", JOptionPane.INFORMATION_MESSAGE);
		userGuessNumber = Integer.parseInt(userGuess);
		
		counter = counter - 1;
		counterString = "(" + counter + " guesses left)";
		do
		{
			if (userGuessNumber > random)
				userGuess = JOptionPane.showInputDialog(null, "The number Im thinking of is lower than that.\n" + counterString, "Program 6", JOptionPane.INFORMATION_MESSAGE);
			else
			{
				if (userGuessNumber < random)
					userGuess = JOptionPane.showInputDialog(null, "The number Im thinking of is higher than that.\n" + counterString, "Program 6", JOptionPane.INFORMATION_MESSAGE);
			}
			
			userGuessNumber = Integer.parseInt(userGuess);
			
			if (counterControl)
			{
				counter = counter - 1;
				counterString = "(" + counter + " guesses left)";
			}
		} while ((userGuessNumber != random) || (counter != 0));
		
		if (userGuessNumber == random)
			JOptionPane.showMessageDialog(null, "Congratulations! You beat the program! My number was: " + random, "Program 6", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Sorry. Better luck next time.", "Program 6", JOptionPane.INFORMATION_MESSAGE);
	}
}