package spj27_lab2;

import javax.swing.JOptionPane;

public class decomposingMoney {

	public static void main(String[] args) {
		
		String userInput = JOptionPane.showInputDialog("Enter an amount of money between 1 and 9999 dollars");
		int number = Integer.parseInt(userInput);
		
		int grands = number / 1000;
		int benjamins = (number % 1000) / 100;
		int sawbucks = (number % 100) / 10;
		int bucks = (number % 10);
		
		System.out.println(grands + " grands");
		System.out.println(benjamins + " benjamins");
		System.out.println(sawbucks + " sawbucks");
		System.out.println(bucks + " bucks");
		
	
	}

}
