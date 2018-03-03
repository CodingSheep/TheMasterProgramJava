package com.JarrodRaine.Classes.CSC160.ClassProjects;

import com.JarrodRaine.Classes.CSC160.ClassProjects.ClassProject11Part1.Status;

/**
 * @author Jarrod Raine
 */

public class ClassProject11Part2
{
	public static void main() throws InterruptedException
	{
		ClassProject11Part1 book1 = new ClassProject11Part1("The Fellowship of the Ring", "J.R.R. Tolkien", "9780345917430", 1137, Status.AVAILABLE);
		ClassProject11Part1 book2 = new ClassProject11Part1("The Two Towers", "J.R.R. Tolkien", "9780345917431", 1137, Status.ONHOLD);
		
		book1.displayBook();
		System.out.println();
		
		book2.displayBook();
		System.out.println();
		
		book1.checkOut();
		Thread.sleep(2000);
		book1.displayBook();
		System.out.println();
		
		book1.returnBook();
		Thread.sleep(2000);
		book1.displayBook();
	}
}
