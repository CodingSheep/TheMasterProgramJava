package com.JarrodRaine.Classes.Misc;

import java.util.Random;

public class Misc4
{
	public static void randomBoard()
	{
		Random ran = new Random();
		int numSpaces = 0;
		
		int[][] boardArray = new int[][]{
				                 {1,1,1,1,1,1,1,1,1,1,1,1,1},
							     {1,0,0,0,0,0,0,0,0,0,0,0,1},
				                 {1,0,0,0,0,0,0,0,0,0,0,0,1},
				                 {1,0,0,0,0,0,0,0,0,0,0,0,1},
				                 {1,0,0,0,0,0,0,0,0,0,0,0,1},
				                 {1,0,0,0,0,0,0,0,0,0,0,0,1},
				                 {1,1,1,1,1,1,1,1,1,1,1,1,1}};
		for(int i = 0; i < boardArray.length; i++)
		{
			for(int j = 0; j < boardArray[0].length; j++)
			{
				if(boardArray[i][j] != 0)
				{
					boardArray[i][j] = (ran.nextInt(10) + 1);
					numSpaces++;
				}
				System.out.print(boardArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("There are a total of " + numSpaces + " spaces");
	}
}