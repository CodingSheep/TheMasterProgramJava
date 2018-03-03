package com.JarrodRaine.Classes.CSC160.Assignments;

/**
 * @author Jarrod Raine
 */

public class SmartPhone
{
	private boolean touchId;
	private double capacity;
	private double displaySize;
	private double price;
	private String name;
	private String os;
	
	public SmartPhone(String name, String os, double capacity, double displaySize, boolean touchId, double price)
	{
		//Just creates phone information
		this.name = name;
		this.os = os;
		this.capacity = capacity;
		this.displaySize = displaySize;
		this.touchId = touchId;
		this.price = price;
	}
	
	public void displayPhone()
	{
		//Prints the information
		System.out.println("Phone Information:");
		System.out.println("Name: " + name);
		System.out.println("OS: " + os);
		System.out.println("Capacity: " + capacity);
		System.out.println("Display Size: " + displaySize + "in.");
		
		//Tests for TouchID
		if(touchId)
			System.out.println("Touch ID: True");
		else
			System.out.println("Touch ID: False");
		System.out.println("Price: $" + price);
		
		//Just to make it look nice in the console
		System.out.println();
	}
	
	//Setters
	
	public void setTouchID(boolean touchId)
	{
		this.touchId = touchId;
	}
	
	public void setCapacity(double capacity)
	{
		if(capacity > 0)
			this.capacity = capacity;
		else
			System.out.println("Invalid Capacity");
	}
	
	public void setDisplaySize(double displaySize)
	{
		if(displaySize > 0)
			this.displaySize = displaySize;
		else
			System.out.println("Invalid Display Size");
	}
	
	public void setPrice(double price)
	{
		if(price > 0)
			this.price = price;
		else
			System.out.println("Invalid Price");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setOS(String os)
	{
		this.os = os;
	}
		
	//Getters
	
	public boolean getTouchID()
	{
		return touchId;
	}
	
	public double getCapacity()
	{
		return capacity;
	}
	
	public double getDisplaySize()
	{
		return displaySize;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getOS()
	{
		return os;
	}
}