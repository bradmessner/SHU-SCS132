// Project:		Topic 5
// Author:		Brad D. Messner
// GitHub:		bradmessner
// Description:	Overview of methods
// Date:		Sep 26, 2019
// Version:		1.0

// Import Required Code (import code for keyboard)
import java.util.Scanner;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start keyboard and declare variables
		Scanner keyboard = new Scanner(System.in);
		int number1 = 15, number2 = 7;
		int result = 0;

		System.out.println("Main Menu\n---- ----\n1.) Addition\n2.) Subtraction\n3.) Exit\nPlease enter a choice: ");
		//System.out.println("Main Menu");
		//System.out.println("=========");
		//System.out.println("1.) Addition");
		//System.out.println("2.) Sub");
		//System.out.println("3.) Exit");
		//System.out.println("Please enter a choice: ");
		
		// int menuchoice;
		// menuChoice = keyboard.nextInt();
		int menuChoice = keyboard.nextInt();
		
		
		switch(menuChoice)
		{
			case 1:
				//result = number1 + number2;
				// this method is passed 2 numbers and returns a result
				result = addition(number1, number2);
				
				// this method is passed a student and NOTHING is returned
				//walkAway(student);
				//walkAway();
				break;
			case 2:
				//result = number1 - number2;
				result = subtraction(number1, number2);
				break;
			default:
				System.out.println("Thank you.  Good bye.");
		}
		
		// Output result
		System.out.println("Your result is: " + result);
		
		// Close keyboard
		keyboard.close();
		
	}
	
	
	
	// Security Static Return Name (Pass in)
	// Would be public static void if you were NOT sending anything back
	public static int addition(int num1, int num2)
	{
		int res = num1 + num2;
		return res;
	}
	
	

	public static int subtraction(int num1, int num2)
	{
		int res = num1 - num2;
		return res;
	}

}
