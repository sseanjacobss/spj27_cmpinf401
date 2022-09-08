package lab2;

import javax.swing.JOptionPane;

public class areaAndPerimeter {

	public static void main(String[] args) {
		
		String userInput = JOptionPane.showInputDialog("Enter the radius of a circle");
		double radius = Double.parseDouble(userInput);
		
		double area = (Math.pow(radius, 2) * Math.PI);
		double perimeter = (2 * Math.PI * radius);
		
		area = area * 100;
		area = Math.round(area);
		area = area/100;
		
		perimeter = perimeter * 100;	
		perimeter = Math.round(perimeter);
		perimeter = perimeter/100;
		
		System.out.println("The circle with a radius of " + radius + " has an area of " + area + " and a perimeter of " + perimeter);

	}
}
