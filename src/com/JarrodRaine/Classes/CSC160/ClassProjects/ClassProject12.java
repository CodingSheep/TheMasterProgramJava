package com.JarrodRaine.Classes.CSC160.ClassProjects;

public class ClassProject12
{
	private static boolean wasThere = false;
	
	public static void main()
	{
		char[] myGrades = {'B', 'A', 'A'};
		String[] mySchedule = {"MAT202", "CSC160", "COM115"}; //Calculus II, Computer Science I, Public Speaking
		
		//I'm using a for loop to display both the class and the corresponding grade on the same line
		System.out.println("Here are your classes and corresponding grades:");
		
		for(int i = 0; i < mySchedule.length; i++)
		{
			System.out.println(mySchedule[i] + "|\t" + myGrades[i]);
		}
		
		//Just to make it look neat
		System.out.println();
		
		//All this code is copied between these methods with only minor changes (Just checking what the grade
		//  for the corresponding class is). Therefore, only displayA() will have comments
		displayA(mySchedule, myGrades);
		displayB(mySchedule, myGrades);
		displayC(mySchedule, myGrades);
	}
	
	private static void displayA(String[] course, char[] grade)
	{
		//Displays classes that have an 'A' in them
		System.out.println("You currently have an 'A' in:");
		
		for(int i = 0; i < course.length; i++)
		{
			if(grade[i] == 'A')
			{
				System.out.println(course[i]);
				wasThere = true;
			}
		}
		
		//If no classes have an 'A'
		if(!wasThere)
			System.out.println("ERROR 404. No classes found!");
		
		//To make it look nice and reset the boolean for the next method
		System.out.println();
		wasThere = false;
	}
	
	private static void displayB(String[] course, char[] grade)
	{
		System.out.println("You currently have a 'B' in:");
		
		for(int i = 0; i < course.length; i++)
		{
			if(grade[i] == 'B')
			{
				System.out.println(course[i]);
				wasThere = true;
			}
		}
		
		if(!wasThere)
			System.out.println("ERROR 404. No classes found!");
		
		System.out.println();
		wasThere = false;
	}
	
	private static void displayC(String[] course, char[] grade)
	{
		System.out.println("You currently have a 'C' in:");
		
		for(int i = 0; i < course.length; i++)
		{
			if(grade[i] == 'C')
			{
				System.out.println(course[i]);
				wasThere = true;
			}
		}
		
		if(!wasThere)
			System.out.println("ERROR 404. No classes found!");
		
		System.out.println();
		wasThere = false;
	}
}