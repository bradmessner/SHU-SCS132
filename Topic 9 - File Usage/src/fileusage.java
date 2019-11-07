// Title:		File Usage
// Author:		Brad D. Messner
// Date:		Nov 6, 2019
// Version:		1.0

import java.io.*;
import java.util.Scanner;

public class fileusage {

										// Don't forget to throw your exception.
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
        // Check if output file exists and either create it or append it
        FileWriter fw = new FileWriter("/Users/bradmessner/Desktop/totalSales.txt", true);
        PrintWriter outputFile = new PrintWriter(fw);
        
        // Create a file to read in from
        File fr = new File("/Users/bradmessner/Desktop/sales.txt");
        Scanner inputFile = new Scanner(fr);
        
        // Create total variables
        double totalA = 0.00;
        double totalB = 0.00;
        double totalC = 0.00;
        
        
        while (inputFile.hasNext())
        {
            // Read line from input file
            char category = inputFile.next().charAt(0);
            double catAmount = inputFile.nextDouble();
            
            switch(category) 
            {
            	case 'A':
            		totalA+=catAmount;
            		break;
            	case 'B':
            		totalB+=catAmount;
            		break;
            	case 'C':
            		totalC+=catAmount;
            		break;
            }
            
        }
        
        // Output results to file
        outputFile.println("Total Sales by Category");
        outputFile.println("=======================");
        outputFile.printf("Category A:\t$%.2f\n", totalA);
        outputFile.printf("Category B:\t$%.2f\n", totalB);
        outputFile.printf("Category C:\t$%.2f\n", totalC);
        
        
        // Close the files
        outputFile.close();
        inputFile.close();

	}

}
