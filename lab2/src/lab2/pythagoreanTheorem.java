package lab2;

import javax.swing.JOptionPane;

public class pythagoreanTheorem {

	public static void main(String[] args) {
		
		String userInput = JOptionPane.showInputDialog("Enter one side length of a triangle");
		int a = Integer.parseInt(userInput);
		
		String userInput1 = JOptionPane.showInputDialog("Input the other side length of the triangle");
		int b = Integer.parseInt(userInput1);
			
		double hypotenuse = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
		
		hypotenuse = hypotenuse * 100;
		hypotenuse = Math.round(hypotenuse);
		hypotenuse = hypotenuse/100;
		
		System.out.println("The hypotenuse of the triangle would be" + " " + hypotenuse);
	}

}
