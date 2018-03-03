package com.JarrodRaine.Classes.CSC160.ClassProjects;

/**
 * @author
 */

public class ClassProject06
{
	public static void alphabet()
	{
		int unicodeLetter = 65;
		
		System.out.println("\"Do-While\" Loop Method Gives Us:");
		do
		{
			if ((char)unicodeLetter != 'Z')
				System.out.print((char)unicodeLetter + "-");
			else
				System.out.print((char)unicodeLetter);
			unicodeLetter++;
		} while (unicodeLetter != 91);
		
		unicodeLetter = 65;
		System.out.println("\n\n\"For\" Loop Method Gives Us:");
		for (int i = 0; i < 26; i++)
		{
			if ((char)(unicodeLetter + i) != 'Z')
				System.out.print((char)(unicodeLetter + i) + "-");
			else
				System.out.print((char)(unicodeLetter + i));
		}
		
		System.out.println("\n\n\"While\" Loop Method Gives Us:");
		unicodeLetter = 65;
		while (unicodeLetter != 91)
		{
			if ((char)unicodeLetter != 'Z')
				System.out.print((char)unicodeLetter + "-");
			else
				System.out.print((char)unicodeLetter);
			unicodeLetter++;
		}
		System.out.println();
	}
}