package spj27_lab5;
import java.util.Random;

import javax.swing.JOptionPane;

public class diceRoller {

	
	public static void rollDice(int numTimes, Random rand) {
		
		int countTwo = 0;
		int countThree = 0;
		int countFour = 0;
		int countFive = 0;
		int countSix = 0;
		int countSeven = 0;
		int countEight = 0;
		int countNine = 0;
		int countTen = 0;
		int countEleven = 0;
		int countTwelve = 0;
		
		int roll = 0;
		int roll2 = 0;
		
		for(int i = 0; i < numTimes; i++) {
			roll = rand.nextInt(0,6) + 1;
			roll2 = rand.nextInt(0,6) + 1;
			int totalRoll = roll + roll2;
			
			switch(totalRoll) {
			
			case(2):
				countTwo = countTwo + 1;
			break;
			case(3):
				countThree = countThree + 1;
			break;
			case(4):
				countFour = countFour + 1;
			break;
			case(5):
				countFive = countFive + 1;
			break;
			case(6):
				countSix = countSix + 1;
			break;
			case(7):
				countSeven = countSeven + 1;
			break;
			case(8):
				countEight = countEight + 1;
			break;
			case(9):
				countNine = countNine + 1;
			break;
			case(10):
				countTen = countTen + 1;
			break;
			case(11):
				countEleven = countEleven + 1;
			break;
			case(12):
				countTwelve = countTwelve + 1;
			break;
			
			}
		}
		
		System.out.println("----------------------------------------------------");
			
		System.out.println("2 was rolled: " + countTwo + " times" + "---------" + "which is a fraction of " + countTwo + "/" + numTimes);
		System.out.println("3 was rolled: " + countThree + " times" + "---------" + "which is a fraction of " + countThree + "/" + numTimes);
		System.out.println("4 was rolled: " + countFour + " times" + "---------" + "which is a fraction of " + countFour + "/" + numTimes);
		System.out.println("5 was rolled: " + countFive + " times" + "---------" + "which is a fraction of " + countFive + "/" + numTimes);
		System.out.println("6 was rolled: " + countSix + " times" + "---------" + "which is a fraction of " + countSix + "/" + numTimes);
		System.out.println("7 was rolled: " + countSeven + " times" + "---------" + "which is a fraction of " + countSeven + "/" + numTimes);
		System.out.println("8 was rolled: " + countEight + " times" + "---------" + "which is a fraction of " + countEight + "/" + numTimes);
		System.out.println("9 was rolled: " + countNine + " times" + "---------" + "which is a fraction of " + countNine + "/" + numTimes);
		System.out.println("10 was rolled: " + countTen + " times" + "---------" + "which is a fraction of " + countTen + "/" + numTimes);
		System.out.println("11 was rolled: " + countEleven + " times" + "---------" + "which is a fraction of " + countEleven + "/" + numTimes);
		System.out.println("12 was rolled: " + countTwelve + " times" + "---------" + "which is a fraction of " + countTwelve + "/" + numTimes);
			
		System.out.println("----------------------------------------------------");
			
	}

}
