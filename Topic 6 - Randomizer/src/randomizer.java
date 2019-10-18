// Project:		Topic 6
// Author:		Brad D. Messner
// GitHub:		bradmessner
// Description:	Overview of random number
// Date:		Sep 26, 2019
// Version:		1.0



import java.util.Random;

public class randomizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randomNumber = new Random();
		
		// This will create a random number between 0 and 5
		// The + 1 will make it 1 to 6.
		int diceRoll = randomNumber.nextInt(6) + 1;

		System.out.println("Your number is: " + diceRoll);

	}

}
