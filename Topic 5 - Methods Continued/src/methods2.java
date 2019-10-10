// Project:		Topic 5B
// Author:		Brad D. Messner
// GitHub:		bradmessner
// Description:	Overview of methods
// Date:		Oct 1, 2019
// Version:		1.0

// Import Required Code (import code for keyboard)
import java.util.Scanner;


public class methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start keyboard and declare variables
		Scanner keyboard = new Scanner(System.in);
		double balance = 0.00;
		int menuChoice = 0;
		double depositAmount = 0.00;
		double withdrawalAmount = 0.00;
		
		do
		{
			mainMenu();
			menuChoice = keyboard.nextInt();
			
			switch (menuChoice)
			{
				case 1:
					System.out.println("How much would you like to deposit? ");	
					depositAmount = keyboard.nextDouble();
					balance = deposit(depositAmount, balance);
					break;
				case 2:
					System.out.println("How much would you like to withdrawal? ");	
					withdrawalAmount = keyboard.nextDouble();
					balance = withdrawal(withdrawalAmount, balance);
					break;
				case 3:
					displayBalance(balance);
					break;
				case 4:
					System.out.println("Thank you!  Have a nice day.");	
					break;
				default:
					System.out.println("Please enter a valid choice.");	
			}
			
		}while (menuChoice != 4);
		
		// Close keyboard
		keyboard.close();

	}
	
	
	// Method to display a menu
	public static void mainMenu()
	{
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.) Make Deposit");
		System.out.println("2.) Withdrawal Funds");
		System.out.println("3.) View Balance");
		System.out.println("4.) Exit");
		System.out.println("What would you like to do? ");
	}
	
	// Method to perform a deposit
	public static double deposit(double amount, double balance)
	{
		return (amount+balance);
	}
	
	// Method to perform a withdrawal
	public static double withdrawal(double amount, double balance)
	{
		return (balance-amount);
	}
	
	// Method to display balance
	public static void displayBalance(double balance)
	{

		System.out.println("Your balance is: " + balance);
	}

}
