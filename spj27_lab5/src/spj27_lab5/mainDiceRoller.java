package spj27_lab5;
import java.util.Random;

import javax.swing.JOptionPane;
public class mainDiceRoller {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		
		while(true) {
			String numRolls = JOptionPane.showInputDialog("Enter the amount of times you want to roll the dice:");
			int numRollsInt = Integer.parseInt(numRolls);
			diceRoller.rollDice(numRollsInt, randomNumber);
			
			String ask = JOptionPane.showInputDialog("Would you like to roll again? Enter 1 for yes, 2 for no");
			
			if(ask.equals("1")) {
				continue;
			} else {
				JOptionPane.showMessageDialog(null, "Thank you for rolling the dice");
				break;
		}	
		}

	}

}
