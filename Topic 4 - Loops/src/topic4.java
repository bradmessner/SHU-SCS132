// Project:		Topic 4
// Author:		Brad D. Messner
// GitHub:		bradmessner
// Description:	Overview of variables, conditions and scanner.
// Date:		Sep 19, 2019
// Version:		1.0

// Import Required Code (import code for keyboard)
//import java.util.Scanner;

public class topic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start keyboard scanner
		// Scanner keyboard = new Scanner(System.in);
		
		// Declare variables
		int counter = 0;
		int loopCounter = 15;
		int secondLoopCounter = 8;
		
		// Highlight Incrementers
		System.out.println("Counter = " + counter);
		counter = counter + 1;
		System.out.println("Counter = " + counter);
		counter++;
		System.out.println("Counter = " + counter);
		++counter;
		System.out.println("Counter = " + counter);
		
		// While Loops
		// There is a chance the while loop may never execute
		while (loopCounter >0)
		{
			System.out.println("Loop Counter = " + loopCounter);
			loopCounter--;		// What happens if you forget this?
		}
		

		// The do while loop is very similar
		// The do while loop is guaranteed to run at least once
		do 
		{
			System.out.println("Second Loop Counter = " + secondLoopCounter);
			secondLoopCounter++;
		}while (secondLoopCounter != 9);
		
		

	}

}
