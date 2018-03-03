package com.JarrodRaine.Classes;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * @author Jarrod Raine
 */

public class Constants
{
	public static final String consoleName = "[Console]: ";
	public static final String finish = "\nProgram Finished";
	public static final String name = "The Master Program";
	public static final String author = "Jarrod Raine";
	public static final String info = "A program written while for my Computer Science Classes";
	public static final String version = "1.2.9";
	public static boolean running = true;
	
	public static void information()
	{
		JOptionPane.showMessageDialog(null, "Name: " + name + "\nCreated by: " + author + "\nVersion: " + version + "\nDescription: " + info, "Information", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void changelog()
	{
		String fileName = "Changelog.txt";
		String line = null;
		
        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null)
            {
            	System.out.println(line);
            }
            bufferedReader.close();            
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Error: Unable to open the Changelog.", "Changelog", JOptionPane.ERROR_MESSAGE);                
        }
        catch(IOException ex)
        {
        	JOptionPane.showMessageDialog(null, "Error: Unable to read file.", "Changelog", JOptionPane.ERROR_MESSAGE);
        }
	}
}