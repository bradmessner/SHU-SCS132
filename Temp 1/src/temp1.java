import java.util.Scanner;

public class temp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard = new Scanner(System.in);
		int menuChoice = 1;
		double amount;
		double change = 0.00;
		
		switch(menuChoice)
		{
			case 1:
				amount = 4.50;
				subTotal(amount);
				change = payment(amount);
				break;
			case 2:
				amount = 3.00;
				subTotal(amount);
				change = payment(amount);
				break;
		}
		
	}
	
	public static void subTotal(double amt)
	{
		System.out.println("Your total is: $" + amt);
	}
	
	public static double payment(double amt)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much will you be paying? $");
		double paymentAmount = keyboard.nextDouble();
		
		return(paymentAmount-amt);
	}

}
