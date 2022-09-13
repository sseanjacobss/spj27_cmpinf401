package spj27_lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog("Enter a value to convert:");
		String unit = JOptionPane.showInputDialog("Enter a unit:");
		
		double numberDouble = Double.parseDouble(number);
		String initial = (number + unit);
		
		double cmToIn = numberDouble / 2.54;
		double inToCm = numberDouble * 2.54;
		double ydToM = numberDouble / 1.094;
		double mToYd = numberDouble * 1.094;
		double ozToGm = numberDouble * 28.35;
		double gmToOz = numberDouble / 28.35;
		double lbToKg = numberDouble / 2.205;
		double kgToLb = numberDouble * 2.205;
		
		String display = initial + " = ";
	
		
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
