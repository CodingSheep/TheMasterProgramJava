package com.JarrodRaine.Classes.CSC160.Assignments;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.JarrodRaine.Classes.Constants;

/**
 * @author Jarrod Raine    (Coded it)
 * @author Brett Durfey    (Bug Tester)
 * @author Joeseph Leavitt (Flowchart)
 */

@SuppressWarnings("serial")
public class Assignment6GUI extends JFrame
{
	private static GridLayout gl = new GridLayout(6,2);
	private static final int WIDTH = 400, HEIGHT = 600;
	private static JButton purc, canc;
	private static JLabel rowL, seatL, priceL, totalSeats, totalPrice;
	private static JTextArea matrix;
	private static JTextField rowD, seatD, price;
	
	static char[][] seats = {{'O','O','O','O','X'},
                                 {'O','X','O','O','O'},
                                 {'O','O','O','X','O'},
		 		 {'O','O','X','O','O'},
		 		 {'X','O','O','O','O'}};
	static double[] prices = {50.00, 40.00, 30.00, 20.00, 10.00};
	static double cost = 0;
	static int claimedSeats = 0;
	
	public static void main(String[] args)
	{
		new Assignment6GUI();
	}
	
	public Assignment6GUI()
	{
		rowL = new JLabel("Row #: ", SwingConstants.RIGHT);
		seatL = new JLabel("Seat #: ", SwingConstants.RIGHT);
		priceL = new JLabel("Price: ", SwingConstants.RIGHT);
		totalSeats = new JLabel("Seat Total: ", SwingConstants.CENTER);
		totalPrice = new JLabel("Price Total: ", SwingConstants.CENTER);
		
		matrix = new JTextArea();
		printMatrix();
		
		price = new JTextField(10);
		rowD = new JTextField(10);
		seatD = new JTextField(10);
		
		purc = new JButton("Purchase");
		canc = new JButton("Cancel");
		
		purc.addActionListener(new PurchaseButtonHandler());
		canc.addActionListener(new ExitButtonHandler());
		
		setTitle("Movie Theater Seating");
		
		Container pane = getContentPane();

		pane.setLayout(gl);
		pane.add(rowL);
		pane.add(rowD);
		pane.add(seatL);
		pane.add(seatD);
		pane.add(priceL);
		pane.add(price);
		pane.add(totalSeats);
		pane.add(totalPrice);
		pane.add(purc);
		pane.add(canc);
        pane.add(matrix);

		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void printMatrix()
	{
		matrix.setText(null);
        for(int i = 0; i < seats.length; i++)
        {
            matrix.append((i+1) + "| ");
            for(int j = 0; j < seats[i].length; j++)
                matrix.append(String.valueOf(seats[i][j]));
            matrix.append("\n");
        }
	}
	
	public static void printPrice(int i)
	{
		price.setText(null);
        price.setText(String.valueOf(prices[i]));
	}
	
	private class PurchaseButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int row = Integer.parseInt(rowD.getText()) - 1;
			int seat = Integer.parseInt(seatD.getText()) - 1;
			
			if(rowD.getText() != null)
			{
				if(seatD.getText() != null)
				{
					switch(seats[row][seat])
					{
					case 'X':
						System.out.println("That seat cannot be taken.");
						break;
					case 'T':
						System.out.println("You have already claimed that seat.");
						break;
					case 'O':
						System.out.println("You have now claimed this seat.");
						claimedSeats++;
						cost += prices[row];
						seats[row][seat] = 'T';
						totalSeats.setText("Seat Total: " + claimedSeats);
						totalPrice.setText("Price Total: " + cost);
						printMatrix();
						printPrice(row);
						break;
					default:
						System.out.println("ERROR IN CODE!");
						System.exit(0);
						break;
					}
				}
			}
		}
	}
	
	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0)
		{
			System.out.println(Constants.finish);
			System.exit(0);
		}
	}
}
