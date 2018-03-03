package com.JarrodRaine.Classes.CSC160.ClassProjects;

/**
 * @author Jarrod Raine
 */

public class ClassProject03
{
	public static void formats()
	{
		double hours = 35.45;
		double rate = 15.00;
		double tolerance = 0.01000;
		
		System.out.println("Fixed Decimal Notation:");
		System.out.printf("Hours = %.2f, Rate = %.2f, Pay = %.2f," +
				" tolerantce = %.2f%n%n", hours, rate, hours * rate, tolerance);
		
		System.out.println("Scientific Notation:");
		System.out.printf("Hours = %e, Rate = %e, Pay = %e, Tolerance = %e", hours, rate, hours * rate, tolerance);
	}
}