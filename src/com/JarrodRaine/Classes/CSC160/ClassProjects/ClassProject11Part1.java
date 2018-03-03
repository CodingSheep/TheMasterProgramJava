package com.JarrodRaine.Classes.CSC160.ClassProjects;

/**
 * @author Jarrod Raine
 */

public class ClassProject11Part1
{
	public enum Status {AVAILABLE, CHECKEDOUT, ONHOLD, OVERDUE}
	
	private int numPages = 0;
	private Status status;
	private String title = "Placeholder Title";
	private String author = "Placeholder Author";
	private String isbn = "Placeholder ISBN";
	
	public ClassProject11Part1(String title, String author, String isbn, int numPages, Status status)
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.numPages = numPages;
		this.status = status;
	}
	
	public void checkOut()
	{
		if(status == Status.AVAILABLE)
			status = Status.CHECKEDOUT;
	}
	
	public void displayBook()
	{
		System.out.println("Book Info:");
		System.out.println("Title | " + title);
		System.out.println("Author| " + author);
		System.out.println("Pages | " + numPages);
		System.out.println("ISBN  | " + isbn);
		System.out.println("Status| " + status);
	}
	
	public void returnBook()
	{
		if(status == Status.ONHOLD)
			status = Status.CHECKEDOUT;
		else
			status = Status.AVAILABLE;
	}
	
	//Setters
	
	public void setNumPages(int numPages)
	{
		if(numPages > 0)
			this.numPages = numPages;
		else if(numPages < 0)
			this.numPages = Math.abs(numPages);
		else
				System.out.println("A book can't have 0 pages. It's like how a car can't have 0 tires.");
	}
	
	public void setStatus(Status status)
	{
		this.status = status;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setISBN(String isbn)
	{
		this.isbn = isbn;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	//Getters
	
	public int getNumPages()
	{
		return numPages;
	}
	
	public Status getStatus()
	{
		return status;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getISBN()
	{
		return isbn;
	}
	
	public String getTitle()
	{
		return title;
	}
}
