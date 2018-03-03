package com.JarrodRaine.Classes.Misc;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * @author Jarrod Raine
 */

public class Misc2
{
	static int levelCode = 0;
	static String[] world = {"Tropical Resort - ", "Tropical Resort - ", "Sweet Mountain - ", "Sweet Mountain - ", "Starlight Carnival - ", "Starlight Carnival - ", "Planet Wisp - ", "Planet Wisp - ", "Aquarium Park - ", "Aquarium Park - ", "Asteroid Coaster - ", "Asteroid Coaster - "};
	static final String[] worldLevel = new String[12];
	
	public static void targettedLevelChooser()
	{	
		for (int i = 0; i < 12; i++)
		{
			levelCode = (int)(Math.random() * 6) + 1;
			worldLevel[i] = world[i] + levelCode;
			while (levelCode == 0)
				levelCode = (int)(Math.random() * 6) + 1;
			worldLevel[i] = world[i] + levelCode;
		}
		
		testForEqual();
		
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
	        public void run()
			{
				JOptionPane.showMessageDialog(null, new JList<Object>(worldLevel), "Misc 2", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	private static void testForEqual()
	{
		while (worldLevel[0].equals(worldLevel[1]))
		{
			levelCode = (int)(Math.random() * 6) + 1;
			worldLevel[1] = world[1] + levelCode;
		}
		while (worldLevel[2].equals(worldLevel[3]))
		{
			levelCode = (int)(Math.random() * 6) + 1;
			worldLevel[3] = world[3] + levelCode;
		}
		while (worldLevel[4].equals(worldLevel[5]))
		{
				levelCode = (int)(Math.random() * 6) + 1;
				worldLevel[5] = world[5] + levelCode;
		}
		while (worldLevel[6].equals(worldLevel[7]))
		{
			levelCode = (int)(Math.random() * 6) + 1;
			worldLevel[7] = world[7] + levelCode;
		}
		while (worldLevel[8].equals(worldLevel[9]))
		{
			levelCode = (int)(Math.random() * 6) + 1;
			worldLevel[9] = world[9] + levelCode;
		}
		while (worldLevel[10].equals(worldLevel[11]))
		{
			levelCode = (int)(Math.random() * 6) + 1;
			worldLevel[11] = world[11] + levelCode;
		}
	}
}