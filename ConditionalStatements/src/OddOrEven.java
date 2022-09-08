import javax.swing.JOptionPane;

public class OddOrEven {

	public static void main(String[] args) {
		
		String userInput = JOptionPane.showInputDialog("Please enter a number");
		int userInputNum = Integer.parseInt(userInput);
		
		if(userInputNum % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		/* BEST WAY OF COMPARING STRINGS
		 
		s1.eaqualsIgnoreCase(s2);
		
		*/
		
	}

}
