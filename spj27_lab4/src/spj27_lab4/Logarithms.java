package spj27_lab4;

import javax.swing.JOptionPane;

public class Logarithms {

	public static void main(String[] args) {
		
		String inputForB = JOptionPane.showInputDialog("Enter a base for the logarithm");
		String inputForX = JOptionPane.showInputDialog("Enter a number to calculate the log of:");
		
		int b = Integer.parseInt(inputForB);
		int x = Integer.parseInt(inputForX);
		int i = 0;
		
		if (x < 0) {
			String secondInputX = JOptionPane.showInputDialog("Invalid Entry for the x value, please input a value greater than 0");
			int x2 = Integer.parseInt(secondInputX);
			x = x2;
			inputForX = secondInputX;
		}
		if (b < 1) {
			String secondInputB = JOptionPane.showInputDialog("Invalid Entry for the base value, please input a value greater than 1");
			int b2 = Integer.parseInt(secondInputB);
			b = b2;
		}
		
		for (i = 0; b < x ; i++) {
			x = x / b;
		}
		
		System.out.println("The log of " + inputForX + " with a base of " + b + " is " + i);

	}

}
