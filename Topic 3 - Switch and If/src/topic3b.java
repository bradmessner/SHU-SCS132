// Project:		Topic 3B
// Author:		Brad D. Messner
// GitHub:		bradmessner
// Description:	Overview of variables, conditions and scanner.
// Date:		Sep 17, 2019
// Version:		1.0

// Import Required Code (import code for keyboard)
import java.util.Scanner;

public class topic3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Declare variables
		int choice;
		
		// Display menu and get user input
		System.out.println("Main Menu");
		System.out.println("=========\n");
		System.out.println("\t1.) Say Yeah!");
		System.out.println("\t2.) Say Hooray!");
		System.out.println("\t3.) Say Goodbye");
		System.out.println("\t4.) Exit\n");
		System.out.print("Please make a choice (1-4): ");
		choice = keyboard.nextInt();
		
		// Note, if you wanted to input a char.  Char's a bit different.
		// char choice;
		// choice = keyboard.next().charAt(0);

		// Output content based upon user input
		switch (choice) 
		{
		case 1:
			System.out.println("Yeah!");
			break;
		case 2:
			System.out.println("Hooray!");
			break;
		case 3:
			System.out.println("Goodbye");
			break;
		case 4:
			System.out.println("Thanks for stopping by.");
			break;
		default:
			System.out.println("You made an invalid choice.  Sorry. :-/");
			// Notice no break is needed!	
		} 
		
		// Close the keyboard
		keyboard.close();

	}

}
