// Project:		Topic 3

// Author:		Brad D. Messner
// GitHub:		bradmessner
// Description:	Overview of variables, conditions and scanner.
// Date:		Sep 12, 2019
// Version:		1.0

// Import Required Code (import code for keyboard)
import java.util.Scanner;
	
public class topic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare variables
		int age = 22;
		double speed = 55.6;
		char middleInitial = 'D';
		String name = "Brad";
		
		// Start keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Collect input from user
		System.out.print("What is your name? ");
		name = keyboard.next();
		System.out.println("What is your age? ");
		age = keyboard.nextInt();
		
		// Output User information
		System.out.println("\n" + name + " is " + age + " years old.");
		
		// Close keyboard
		keyboard.close();
		

		// Determine what kind of drink user is permitted.
		if (age < 21)
		{
			System.out.println("How about a nice glass of tea?");
		}
		else   // if age is greater than or equals 21
		{
			System.out.println("You can drink whatever you would like.");
		}

		
	}

}
