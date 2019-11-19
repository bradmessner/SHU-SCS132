// Header

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Collect input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What number would you like to calculate the factorial on? ");
		int factorialNum = keyboard.nextInt();
		System.out.println("Factorial is: " +factorial(factorialNum));
		
		
		keyboard.close();
	}

	
	
	
	private static int factorial(int n)
	{
		System.out.println("Value of n is: " + n);
		if (n == 0) 
			return 1; // Base case
		else 
			return (n * factorial(n - 1));
	}
	
	
	
}



