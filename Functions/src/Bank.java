
public class Bank {

	public static void main(String[] args) {
		
		double balance = 1000;
		
		balance = withdrawal(balance, 10);
		System.out.println(balance);
		
		balance = withdrawal(1000, 10, "CAD");
		System.out.println(balance);
		
		balance = deposit(1000, 100);
		System.out.println(balance);

	}
	
	public static double withdrawal(double initialBalance, double amount) {
		
		double finalBalance = initialBalance - amount;
		return finalBalance;
		
	}
	
	public static double withdrawal(double initialBalance, double amount, String currency) {
		
		double finalBalance = initialBalance;
		
		if (currency.equalsIgnoreCase("CAD")) {
			amount = amount * 0.77;
		}
		
		return finalBalance;
		
	}
	
	public static double deposit(double initialBalance, double amount) {
		double finalBalance = initialBalance + amount;
		return finalBalance;
	}
	

}
