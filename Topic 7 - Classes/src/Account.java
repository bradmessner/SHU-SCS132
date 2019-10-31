// Class: Account


public class Account {
	
	public String name = "";
	public double balance = 0.00;

	// Constructor
	public Account() {
		name = "Checking Account";
	}
	
	// Withdrawal (Method)
	public void withdrawal(double withAmount) {
		balance = balance - withAmount;
	}
	
	// Deposit (Method)
	public void deposit(double depAmount) {
		balance = balance + depAmount;
	}
	
	
	// Check Balance (Method)
	public void checkBalance() {
		System.out.println("You balance is $" + balance);
	}
	
}
