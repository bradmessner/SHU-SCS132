// Project:		Topic 4B
// Author:		Brad D. Messner
// GitHub:		bradmessner
// Description:	Overview of for loops
// Date:		Sep 24, 2019
// Version:		1.0

// Import Required Code (import code for keyboard)
import java.util.Scanner;

public class topic4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Start keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Declare variables and prompt user for input
		int age;
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		// Use a for loop to count down until retirement
		for (int i = age; i <=65; i++)
		{
			if(i<65)
				System.out.println("You are " + i + ". Only " + (65-i) + " years until you retire!");
			else
				System.out.println("You are 65! You finally can retire!");
		}
		
		
		// Close Keyboard
		keyboard.close();
		
		
	}

}
