package com.JarrodRaine.Classes.CSC160.ClassProjects;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.JarrodRaine.Classes.Constants;

/**
 * @author Jarrod Raine
 */

@SuppressWarnings("serial")
public class ClassProject13 extends JFrame
{	
	private static final int WIDTH = 400, HEIGHT = 300;
	
	private static JButton calc, exit;
	private static JLabel radiusL, areaL, perimeterL;
	private static JTextField radiusD, areaD, perimeterD;
	
	public static void main()
	{
		new ClassProject13();
	}
	
	public ClassProject13()
	{
		radiusL = new JLabel("Enter the Radius: ", SwingConstants.RIGHT);
		areaL = new JLabel("Area: ", SwingConstants.RIGHT);
		perimeterL = new JLabel("Perimeter: ", SwingConstants.RIGHT);
		
		radiusD = new JTextField(10);
		areaD = new JTextField(10);
		perimeterD = new JTextField(10);
		
		calc = new JButton("Calculate");
		exit = new JButton("Exit");
		
		calc.addActionListener(new CalculateButtonHandler());
		exit.addActionListener(new ExitButtonHandler());
		
		setTitle("Area and Perimeter of a Circle");
		
		Container pane = getContentPane();

		pane.setLayout(new GridLayout(4,2));
		pane.add(radiusL);
		pane.add(radiusD);
		pane.add(areaL);
		pane.add(areaD);
		pane.add(perimeterL);
		pane.add(perimeterD);
		pane.add(calc);
		pane.add(exit);

		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double radius = Double.parseDouble(radiusD.getText());
			
			areaD.setText((radius * radius) + "\u03C0");
			perimeterD.setText((2 * radius) + "\u03C0");
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