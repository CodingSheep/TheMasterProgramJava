package com.JarrodRaine.Classes.CSC160.Assignments;

import java.util.Scanner;

public class Assignment6
{
	static boolean stillGoing = true;
	static char[][] seats = {{'O','O','O','O','X'},
							 {'O','X','O','O','O'},
							 {'O','O','O','X','O'},
							 {'O','O','X','O','O'},
							 {'X','O','O','O','O'}};
	static double[] prices = {50.00, 40.00, 30.00, 20.00, 10.00};
	static double cost = 0;
	static int claimedSeats = 0;
	static Scanner a6 = new Scanner(System.in);
	
	public static void main()
	{
		String choice;
		do
		{
			displayArray();
			System.out.println("Would you like to claim a seat? (\"Y\" or \"y\")");
			System.out.print(">>");
			choice = a6.next();
			if(choice.equalsIgnoreCase("y"))
				claimSeat();
			else
			{
				if(claimedSeats == 0)
					System.out.println("No seats for you then");
				stillGoing = false;
			}
		}while(stillGoing);
		System.out.println("You have claimed " + claimedSeats + " seat(s) for $" + cost + ".");
	}
	
	private static void checkAvailable(int userNum1, int userNum2)
	{
		//Checks what character value the seats correspond to (X if taken, T if User is taking them, O if available)
		switch(seats[userNum1][userNum2])
		{
		case 'X':
			System.out.println("That seat cannot be taken.");
			System.out.println();
			break;
		case 'T':
			System.out.println("You have already claimed that seat.");
			System.out.println();
			break;
		case 'O':
			System.out.println("You have now claimed this seat.");
			System.out.println();
			claimedSeats++;
			cost += prices[userNum1];
			seats[userNum1][userNum2] = 'T';
			break;
		default:
			System.out.println("ERROR IN CODE!");
			System.exit(0);
			break;
		}
			
	}
	
	private static void claimSeat()
	{
		int num1, num2;
		
		//Asks the user which row to look at for seats
		//Also makes sure the row is valid
		System.out.println("Which row would you like to look at?");
		do
		{
			System.out.print(">>");
			num1 = a6.nextInt();
			if(num1 > 5 || num1 < 1)
				System.out.println("Invalid Row Number");
		}while(num1 > 5 || num1 < 1);
		
		//Asks the user which seat to look at for seats
		//Also makes sure the seat is valid
		System.out.println("Which seat would you like to claim?");
		do
		{
			System.out.print(">>");
			num2 = a6.nextInt();
			if(num2 > 5 || num2 < 1)
				System.out.println("Invalid Seat Number");
		}while(num2 > 5 || num2 < 1);
		
		//The reason the parameters are subtracted by one is because of how array indexes work
		System.out.println("Checking Seat Availability of Seat: " + num1 + "-" + num2);
		checkAvailable(num1 - 1, num2 - 1);
	}
	
	private static void displayArray()
	{
		//Does the the method says it does
		
		//Makes it look nice at first
		System.out.println("Seating:");
		System.out.print("  ");
		for(int i = 0; i < seats.length; i++)
		{
			System.out.print(" " + (i + 1));
		}
		System.out.println("  Prices:");
		
		//Prints the array
		for(int i = 0; i < seats.length; i++)
		{
			System.out.print((i + 1) + "| ");
			for(int j = 0; j < seats[i].length; j++)
			{
				System.out.print(seats[i][j] + " ");
			}
			System.out.print(" $" + prices[i]);
			System.out.println();
		}
		//Displays current cost for the seats you have purchased thus far
		System.out.println("Total Cost for Seating: $" + cost);
	}
}