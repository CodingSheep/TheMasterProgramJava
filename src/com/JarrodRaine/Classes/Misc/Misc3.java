package com.JarrodRaine.Classes.Misc;

public class Misc3
{
	public static void arrayGames()
	{
		int random = (int) Math.ceil(Math.random() * 5);
		
		System.out.println("Let's see if you're lucky:");
		switch(random)
		{
		case 1:
		case 2:
			battleship();
			break;
		case 4:
		case 5:
			ticTacToe();
			break;
		default:
			System.out.println("Not today");
			break;
		}
	}
	
	private static void ticTacToe()
	{
		int[][] ttt = new int[3][3];
		for(int i = 0; i < ttt.length; i++)
		{
			for(int j = 0; j < ttt[i].length; j++)
			{
				ttt[i][j] = i + j;
			}
		}
		for(int i = 0; i < ttt.length; i++)
		{
			for(int j = 0; j < ttt[i].length; j++)
			{
				System.out.print(ttt[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void battleship()
	{
		int[][] bs = new int[9][9];
		for(int i = 0; i < bs.length; i++)
		{
			for(int j = 0; j < bs[i].length; j++)
			{
				bs[i][j] = i + j;
			}
		}
		for(int i = 0; i < bs.length; i++)
		{
			for(int j = 0; j < bs[i].length; j++)
			{
				System.out.print(bs[i][j]);
			}
			System.out.println();
		}
	}
}