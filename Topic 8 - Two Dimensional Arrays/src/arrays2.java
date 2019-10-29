// Header

public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
			/* Here is what the array we loaded looks like:
			 		1	2	3	4
			 		5	6	7	8
			 		9	10	11	12 
			 */
			
			// Let's override the 7
			numbers[1][2] = 13;
			
			// Create a total variable for each row
			int total= 0;

			// Loop through each row
			for (int row = 0; row < numbers.length; row++)
			{
				
				// Reset the total for each row
				total = 0;
				
				// Loop through each column
				// Note that we loop through numbers[0].length rather than numbers.length since we are looking at the second dimension
				for (int col = 0; col < numbers[0].length; col++)
				{
					// Output the columns of the array for the specific row/col
					System.out.print(numbers[row][col] + "\t");
					total = total + numbers[row][col];
				}
				
				// Output new line
				System.out.print(total + "\n");
				
			}
			


	}

}
