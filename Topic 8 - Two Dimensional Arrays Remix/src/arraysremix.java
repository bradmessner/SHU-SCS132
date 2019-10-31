// Topic: 		Arrays - 2 Dimension
// Date: 		Oct 30, 2019
// Author:		Brad D. Messner

import java.util.Scanner;

public class arraysremix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores = new int[2][4];


		Scanner keyboard = new Scanner(System.in);
		int teamOneTotal= 0;
		int teamTwoTotal = 0;
		String teamOne = "";
		String teamTwo = "";
		

		for (int col = 0; col < scores[0].length; col++)
		{
			

			for (int row = 0; row < scores.length; row++)
			{
				// Collect info for Team One
				if(row==0)
				{
					System.out.print("What is the score for Team One in Quarter " + (col+1) + ":");
					scores[row][col] = keyboard.nextInt();
					teamOneTotal+= scores[row][col];
					teamOne = teamOne+ scores[row][col] + "\t" ;
				}
				
				// Collect info for Team Two
				if(row==1)
				{
					System.out.print("What is the score for Team Two in Quarter " + (col+1) + ":");
					scores[row][col] = keyboard.nextInt();
					teamTwoTotal+= scores[row][col];
					teamTwo = teamTwo + scores[row][col] + "\t" ;
				}
			}
			
		}
		
		System.out.println(teamOne + teamOneTotal);
		System.out.println(teamTwo + teamTwoTotal);
		
		// Close the keyboard
		keyboard.close();
	}

}
