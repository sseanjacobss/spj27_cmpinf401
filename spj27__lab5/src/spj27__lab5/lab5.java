package spj27__lab5;


import java.util.Random;

import javax.swing.JOptionPane;

public class lab5 {

	public class RollDice {
		
		private static int roll;
		private static int roll2;
		private static int totalRoll;
		private static int rollNumber;
		private static int countTwo;
		private static int countThree;
		private static int countFour;
		private static int countFive;
		private static int countSix;
		private static int countSeven;
		private static int countEight;
		private static int countNine;
		private static int countTen;
		private static int countEleven;
		private static int countTwelve;
	
	public static void main(String[] args) {
		
		String rolls = JOptionPane.showInputDialog("Enter a number of times to roll the dice:");
		String quit = JOptionPane.showInputDialog("Enter 'QUIT' when you are done rolling the dice:");
		int rollNumber = Integer.parseInt(rolls);
		System.out.println(countTwo);

	}
	
	public static void rolldice(int numTimes, Random rand) {
		
		for (int i = 0; i <= rollNumber; i++) {
			
			Random num = new Random();
			roll = (int)(Math.random()*6) + 1;
			roll2 = (int)(Math.random()*6) + 1;
			totalRoll = roll + roll2;
			rolldice(rollNumber, num);
			
			if (totalRoll == countTwo) {
				countTwo = countTwo + 1;
			} else if (totalRoll == countThree) {
				countThree = countThree + 1;
			} else if (totalRoll == countFour) {
				countFour = countFour + 1;
			} else if (totalRoll == countFive) {
				countFive = countFive + 1;
			} else if (totalRoll == countSix) {
				countSix = countSix + 1;
			} else if (totalRoll == countSeven) {
				countSeven = countSeven + 1;
			} else if (totalRoll == countEight) {
				countEight = countEight + 1;
			} else if (totalRoll == countNine) {
				countNine = countNine + 1;
			} else if (totalRoll == countTen) {
				countTen = countTen + 1;
			} else if (totalRoll == countEleven) {
				countEleven = countEleven + 1;
			} else {
				countTwelve = countTwelve + 1;
			}
			
		}
		
}
	}	
}