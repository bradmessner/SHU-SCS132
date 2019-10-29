// Header
// Today we are going to:
// Create, populate, and output arrays
// What happens if we mis-understand array sizes and indexes?
// How can we break and how can we fix arrays?
// Would it make sense to move this to a method?

import java.util.Scanner;
import java.util.Random;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Start variables
		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();
		
		// Create the array with a size of 5
		// Array indexes will be 0-4
		int[] scores = new int[5];
		
		// Populate the array
		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 4;
		scores[3] = 6;
		scores[4] = 4;
		
		// Output the contents of the array
		for (int i=0; i<scores.length;i++)
		{
			System.out.println("Your value in index " + i + " is: " + scores[i] + ".");
		}
		
		
		
		
		
		
		// Let's create a new array based upon the user input
		int arraySize = 0;
		System.out.println("How many numbers would you like? ");
		arraySize = keyboard.nextInt();
		int[] myNumbers = new int[arraySize];
		
		// Now let's populate the array using a loop with random numbers
		for (int i=0; i<arraySize;i++)
		{
			myNumbers[i] = randomNumbers.nextInt(100) + 1;
			System.out.println("Your value in index " + i + " is: " + myNumbers[i] + ".");
		}
		
		
		// Close keyboard
		keyboard.close();
	}

}
