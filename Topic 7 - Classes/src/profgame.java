// header

// This is our main application file
// You can tell that because it contains the main method.  Look at line 11

import java.util.Scanner;
import java.util.Random;

public class profgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize Keyboard, Random Number Gen, and Variables
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		int randomToss = 0;
		int menuChoice = 0;
		
		// Initialize an instance of the class Professor
		// We are only making one, but we could make as many as we want
		// Professor profTwo = new Professor();
		Professor profOne = new Professor();

		

		
		//Display menu and execute class methods
		do 
		{
			System.out.println("Throw Your Prof!");
			System.out.println("~=~=~=~=~=~=~=~=");
			System.out.println("1.) Display Professor Information");
			System.out.println("2.) Like Your Professor");
			System.out.println("3.) Dislike Your Professor");
			System.out.println("4.) Throw Your Professor!");
			System.out.println("5.) Exit");
			System.out.print("What would you like to do? ");
			menuChoice = keyboard.nextInt();
			
			switch (menuChoice)
			{
			case 1:
				profOne.displayInfo();
				//profTwo.displayinfo();
				//System.out.print(profOne.name);
				break;
			case 2:
				profOne.like();
				break;
			case 3:
				profOne.dislike();
				break;
			case 4:
				randomToss = randomNumber.nextInt(11);
				profOne.throwProf(randomToss);
				break;
			case 5:
				System.out.println("Thank you for playing.  Your professor is going to lay down and rest.");
				break;
			default:
				System.out.println("Please enter a valid choice.  Your grade depends on it.");
			}
		}while(menuChoice != 5);
		
		//Close keyboard
		keyboard.close();
		
	}

}
