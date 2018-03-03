package com.JarrodRaine.Classes.CSC160.Assignments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jarrod Raine
 */

public class PhoneTester
{	
	static ArrayList<SmartPhone> phoneList = new ArrayList<SmartPhone>();
	static Scanner a5 = new Scanner(System.in);
	
	//Creates Phone Objects and displays their specifications
	static SmartPhone phone1 = new SmartPhone("Jack's Phone", "Jack's OS", 16.0, 4.5, true, 175.0);		
	static SmartPhone phone2 = new SmartPhone("Jill's Phone", "Jill's OS", 18.0, 5.0, false, 150.0);	
	static SmartPhone phone3 = new SmartPhone("Bob's Phone", "Bob's OS", 20.0, 4.0, false, 160.0);
	static String choice;
	
	public static void main()
	{	
		do
		{
			System.out.println("\nWould you like to change your Phone ArrayList? (Yes or no)");
			choice = a5.nextLine().toLowerCase();
			switch(choice)
			{
			case "yes":
				yesChoice();
				break;
			case "no":
				System.out.println("Alright then");
				System.exit(0);
			default:
				System.out.println("What?");
				break;
			}
		} while(choice != "no");
	}
	
	private static void yesChoice()
	{
		boolean add = true;
		boolean del = false;
		String[] choices = {"Add Phones", "Remove Phones", "Check", "Display ArrayList"};
		String[] checkChoices = {"Display Size", "Capacity Size", "Information", "Price", "TouchID"};
		String[] phoneChoices = {"Phone1", "Phone2", "Phone3"};
		
		for(int i = 0; i < choices.length; i++)
			System.out.println("| " + choices[i]);
		
		System.out.println("\nSo what do you want to do?");
		choice = a5.nextLine().toLowerCase();
		switch(choice)
		{
		case "add phones":
			for(int i = 0; i < phoneChoices.length; i++)
				System.out.println("| " + phoneChoices[i]);
			
			System.out.println("\nWhat phones would you like to add?");
			choice = a5.nextLine().toLowerCase();
			
			switch(choice)
			{
			case "phone1":
				for(int i = 0; i < phoneList.size(); i++)
				{
					if(phoneList.equals(phone1))
					{
						add = false;
						break;
					}
				}
				if(add)
					phoneList.add(phone1);
				else
					System.out.println("That phone is already in your ArrayList");
				add = true;
				break;
			case "phone2":
				for(int i = 0; i < phoneList.size(); i++)
				{
					if(phoneList.equals(phone2))
					{
						add = false;
						break;
					}
				}
				if(add)
					phoneList.add(phone2);
				else
					System.out.println("That phone is already in your ArrayList");
				add = true;
				break;
			case "phone3":
				for(int i = 0; i < phoneList.size(); i++)
				{
					if(phoneList.equals(phone3))
					{
						add = false;
						break;
					}
				}
				if(add)
					phoneList.add(phone3);
				else
					System.out.println("That phone is already in your ArrayList");
				add = true;
				break;
			default:
				System.out.println("What?");
				break;
			}
			break;
		case "remove phones":
			if(phoneList.isEmpty())
				System.out.println("You dont have any phones in your list");
			else
			{
				for(int i = 0; i < phoneList.size(); i++)
					System.out.println("| " + phoneList);
				System.out.println("\nAlright then. Which phones?");
				switch(choice)
				{
				case "phone1":
					for(int i = 0; i < phoneList.size(); i++)
					{
						if(phoneList.get(i).equals(phone1))
						{
							del = true;
							break;
						}
					}
					if(del)
						phoneList.remove(phone1);
					else
						System.out.println("That phone wasn't in the ArrayList");
					del = false;
					break;
				case "phone2":
					for(int i = 0; i < phoneList.size(); i++)
					{
						if(phoneList.get(i).equals(phone1))
						{
							del = true;
							break;
						}
					}
					if(del)
						phoneList.remove(phone1);
					else
						System.out.println("That phone wasn't in the ArrayList");
					del = false;
					break;
				case "phone3":
					for(int i = 0; i < phoneList.size(); i++)
					{
						if(phoneList.get(i).equals(phone1))
						{
							del = true;
							break;
						}
					}
					if(del)
						phoneList.remove(phone1);
					else
						System.out.println("That phone wasn't in the ArrayList");
					del = false;
					break;
				default:
					System.out.println("What?");
					break;
				}
			}
			break;
		case "check":
			for(int i = 0; i < phoneChoices.length; i++)
				System.out.println("| " + checkChoices[i]);
			
			System.out.println("What would you like to check?");
			choice = a5.nextLine().toLowerCase();
			switch(choice)
			{
			case "information":
				display();
				break;
			case "display size":
				checkDisplaySize();
				break;
			case "capacity size":
				checkCapacitySize();
				break;
			case "price":
				checkPrice();
				break;
			case "touchid":
				checkTouchId();
				break;
			default:
				System.out.println("What?");
				break;
			}
			break;
		case "display arraylist":
			for(int i = 0; i < phoneList.size(); i++)
			{
				phoneList.get(i).displayPhone();
				System.out.println();
			}
			break;
		default:
			System.out.println("What?");
			break;
		}
	}

	private static void display()
	{
		phone1.displayPhone();
		phone2.displayPhone();
		phone3.displayPhone();
	}
	
	private static void checkDisplaySize()
	{
		if(phone1.getDisplaySize() > phone2.getDisplaySize() && phone1.getDisplaySize() > phone3.getDisplaySize())
			System.out.println("The phone with the largest display size is " + phone1.getName() + " with a " + phone1.getDisplaySize() + "in. display");
		if(phone2.getDisplaySize() > phone1.getDisplaySize() && phone2.getDisplaySize() > phone3.getDisplaySize())
			System.out.println("The phone with the largest display size is " + phone2.getName() + " with a " + phone2.getDisplaySize() + "in. display");
		if(phone3.getDisplaySize() > phone1.getDisplaySize() && phone3.getDisplaySize() > phone2.getDisplaySize())
			System.out.println("The phone with the largest display size is " + phone3.getName() + " with a " + phone3.getDisplaySize() + "in. display");
		
		if(phone1.getDisplaySize() < phone2.getDisplaySize() && phone1.getDisplaySize() < phone3.getDisplaySize())
			System.out.println("The phone with the smallest display size is " + phone1.getName() + " with a " + phone1.getDisplaySize() + "in. display");
		if(phone2.getDisplaySize() < phone1.getDisplaySize() && phone2.getDisplaySize() < phone3.getDisplaySize())
			System.out.println("The phone with the smallest display size is " + phone2.getName() + " with a " + phone2.getDisplaySize() + "in. display");
		if(phone3.getDisplaySize() < phone1.getDisplaySize() && phone3.getDisplaySize() < phone2.getDisplaySize())
			System.out.println("The phone with the smallest display size is " + phone3.getName() + " with a " + phone3.getDisplaySize() + "in. display");
	}
	
	private static void checkCapacitySize()
	{
		if(phone1.getCapacity() > phone2.getCapacity() && phone1.getCapacity() > phone3.getCapacity())
			System.out.println("The phone with the most capacity is " + phone1.getName() + " with " + phone1.getCapacity() + " GB");
		if(phone2.getCapacity() > phone1.getCapacity() && phone2.getCapacity() > phone3.getCapacity())
			System.out.println("The phone with the most capacity is " + phone2.getName() + " with " + phone2.getCapacity() + " GB");
		if(phone3.getCapacity() > phone1.getCapacity() && phone3.getCapacity() > phone2.getCapacity())
			System.out.println("The phone with the most capacity is " + phone3.getName() + " with " + phone3.getCapacity() + " GB");
		
		if(phone1.getCapacity() < phone2.getCapacity() && phone1.getCapacity() < phone3.getCapacity())
			System.out.println("The phone with the least capacity is " + phone1.getName() + " with " + phone1.getCapacity() + " GB");
		if(phone2.getCapacity() < phone1.getCapacity() && phone2.getCapacity() < phone3.getCapacity())
			System.out.println("The phone with the least capacity is " + phone2.getName() + " with " + phone2.getCapacity() + " GB");
		if(phone3.getCapacity() < phone1.getCapacity() && phone3.getCapacity() < phone2.getCapacity())
			System.out.println("The phone with the least capacity is " + phone3.getName() + " with " + phone3.getCapacity() + " GB");
	}
	
	private static void checkPrice()
	{
		if(phone1.getPrice() > phone2.getPrice() && phone1.getPrice() > phone3.getPrice())
			System.out.println("The most expensive phone is " + phone1.getName() + " at $" + phone1.getPrice());
		if(phone2.getPrice() > phone1.getPrice() && phone2.getPrice() > phone3.getPrice())
			System.out.println("The most expensive phone is " + phone2.getName() + " at $" + phone2.getPrice());
		if(phone3.getPrice() > phone1.getPrice() && phone3.getPrice() > phone2.getPrice())
			System.out.println("The most expensive phone is " + phone3.getName() + " at $" + phone3.getPrice());
		
		if(phone1.getPrice() < phone2.getPrice() && phone1.getPrice() < phone3.getPrice())
			System.out.println("The least expensive phone is " + phone1.getName() + " at $" + phone1.getPrice());
		if(phone2.getPrice() < phone1.getPrice() && phone2.getPrice() < phone3.getPrice())
			System.out.println("The least expensive phone is " + phone2.getName() + " at $" + phone2.getPrice());
		if(phone3.getPrice() < phone1.getPrice() && phone3.getPrice() < phone2.getPrice())
			System.out.println("The least expensive phone is " + phone3.getName() + " at $" + phone3.getPrice());
	}
	
	private static void checkTouchId()
	{
		if(phone1.getTouchID())
			System.out.println(phone1.getName() + " has TouchID");
		else
			System.out.println(phone1.getName() + " does not have TouchID");
		if(phone2.getTouchID())
			System.out.println(phone2.getName() + " has TouchID");
		else
			System.out.println(phone2.getName() + " does not have TouchID");
		if(phone3.getTouchID())
			System.out.println(phone3.getName() + " has TouchID");
		else
			System.out.println(phone3.getName() + " does not have TouchID");
	}
}