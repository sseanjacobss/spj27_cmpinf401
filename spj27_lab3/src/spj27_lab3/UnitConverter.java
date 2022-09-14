package spj27_lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		// receiving user input and converting the number and unit into two separate variables
		String input = JOptionPane.showInputDialog("Enter a distance or weight and its associated unit. (Makes sure to include a space in between the number and the unit");
		String number[] = input.split(" ");
		
		String numbers = number[0];
		double chosenNumber = Double.parseDouble(numbers);
		
		String unit = number[1];
		
		// conversion factors being assigned as a double
		double cmToIn = chosenNumber / 2.54;
		double inToCm = chosenNumber * 2.54;
		double ydToM = chosenNumber / 1.094;
		double mToYd = chosenNumber  * 1.094;
		double ozToGm = chosenNumber  * 28.35;
		double gmToOz = chosenNumber  / 28.35;
		double lbToKg = chosenNumber  / 2.205;
		double kgToLb = chosenNumber  * 2.205;
		
		// creating a string that will be used in all forms of feedback response
		String initial = (chosenNumber + unit);
		String display = initial + " = ";
	
		// if statements to determine units and conversion factors.
		if (unit.equalsIgnoreCase("cm")) {
			System.out.println(display + cmToIn + "in");
		} else if (unit.equalsIgnoreCase("in")) {
			System.out.println(display + inToCm + "cm");
		}
		
		if(unit.equalsIgnoreCase("yd")) {
			System.out.println(display + ydToM + "m");
		} else if (unit.equalsIgnoreCase("m")) {
			System.out.println(display + mToYd + "yd");
		}
		
		if (unit.equalsIgnoreCase("oz")) {
			System.out.println(display + ozToGm + "gm");
		} else if (unit.equalsIgnoreCase("gm")) {
			System.out.println(display + gmToOz + "oz");
		}
		
		if (unit.equalsIgnoreCase("lb")) {
			System.out.println(display + lbToKg + "kg");
		} else if (unit.equalsIgnoreCase("kg")) {
			System.out.println(display + kgToLb + "lb");
		}
	}

}
