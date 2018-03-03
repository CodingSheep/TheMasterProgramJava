package com.JarrodRaine.Classes.Misc;

import java.util.Scanner;

/**
 * @author Jarrod Raine
 */

public class Misc1
{
	static Scanner m1 = new Scanner(System.in);
    public static void filthBridge() throws InterruptedException
    {
    	//Variables
    	int Loop;
    	int Counter = 0;
    	int Repeat = 0;
      
    	//Operation
    	System.out.println("Enter the number of times you want 'Filth Bridge' to loop:");
    	Loop = m1.nextInt();
    	System.out.println("We're building a:");
    	
    	Thread.sleep(500);
      
    	while (Loop > 0)
    	{
    		for (int i = 0; i < 8; i++)
    		{
    			System.out.println("Filth");
    			Thread.sleep(500);
    			System.out.println("Bridge");
    			Thread.sleep(500);
    		}
    		Thread.sleep(10);
    		System.out.println("BRIDGE!");
        	Counter++;
        	Repeat = Counter * 8;
    		Loop--;
    	}
    	System.out.println("\nThe song, 'Filth Bridge', repeated " + Counter + " times.");
    	System.out.println("\nThe words, 'Filth Bridge', repeated " + Repeat + " times.");
    	System.out.println("\nSong created by Hat Films. Subscribe to their channel:");
    	System.out.println("http://www.youtube.com/user/HaatFilms");
    }
}