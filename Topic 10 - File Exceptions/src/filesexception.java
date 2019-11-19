// Title:		File Exception
// Author:		Brad D. Messner
// Date:		Nov 12, 2019
// Version:		1.0

import java.io.*;
import java.util.Scanner;

public class filesexception {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		try {

			// Check if output file exists and either create it or append it
			FileWriter fw = new FileWriter("/Users/bradmessner/Desktop/totalGrades.txt", true);
			PrintWriter outputFile = new PrintWriter(fw);

			// Create a file to read in from
			File fr = new File("/Users/bradmessner/Desktop/grades.txt");
			Scanner inputFile = new Scanner(fr);

			// Create total variables
			int totalGrades = 0;
			int gradeCounter = 0;
	

			while (inputFile.hasNext())
			{
				int grade = inputFile.nextInt();
				totalGrades += grade;
				gradeCounter++;

			}

			outputFile.println("Grade Statistics");
			outputFile.println("================");
			outputFile.println("Total Points: " + totalGrades);
			outputFile.println("Total Assignments: " +gradeCounter);
			outputFile.println("Average Score: " + (totalGrades/gradeCounter));


			// Close the files
			outputFile.close();
			inputFile.close();

		}
		catch (EOFException error)
		{
			System.out.println("Sorry.  I seem to have reached the end of the file.");
			System.out.println("Error Message: " + error.getMessage());
		}
		catch (FileNotFoundException error)
		{
			System.out.println("Sorry.  I cannot seem to find that file.");
			System.out.println("Error Message: " + error.getMessage());
		}




	}

}
