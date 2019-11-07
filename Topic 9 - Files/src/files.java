// Header

// Open the code packages for file usage
import java.io.*;
import java.util.Scanner;

public class files {

											// Account for if an error occurs during file usage
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

        // Check if output file exists and either create it or append it
        FileWriter fw = new FileWriter("/Users/bradmessner/Desktop/StudentOut.txt", true);
        PrintWriter outputFile = new PrintWriter(fw);
        
        // Create a file to read in from
        File myFile = new File("/Users/bradmessner/Desktop/StudentIn.txt");
        Scanner inputFile = new Scanner(myFile);
        
        while (inputFile.hasNext())
        {
            // Read line from input file
            String studentName = inputFile.nextLine();
            studentName = studentName + " is " + studentName.length() + " characters long.";
            System.out.println(studentName);
            
            // Write to file
            outputFile.println(studentName);
        }
        
        
        // Close the files
        outputFile.close();
        inputFile.close();
		
	}

}
