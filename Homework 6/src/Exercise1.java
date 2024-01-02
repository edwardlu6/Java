//This homework is completed by Karla Murueta and Edward Lu

import java.util.*;

public class Exercise1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double[][] arr = new double[3][4]; //create a 2D array with 3 rows and 4 columns.
		double num = 0;
		
		System.out.println("Enter a 3 by 4 matrix row by row: ");
		
		// a 'for' loop to store input numbers into arr.
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				num = sc.nextDouble(); //read input
				arr[i][j] = num; // make elements in arr to reference that input
			}
		}
		
		// a 'for' loop to sum all numbers in each column.
		for (int column=0; column<arr[0].length; column++) {
			System.out.println("Sum of the elements at Column " + column + " is " +sumColumn(arr, column));
		}
		
		

	}
	
	// the method to sum all numbers in the specified column
	public static double sumColumn(double[][] m, int columnIndex) {
		
		double sumOfColumn = 0;
		
		for (int i=0; i<m.length; i++) {
			
			//sum all the numbers.
			sumOfColumn += m[i][columnIndex]; 

		}
		
		return sumOfColumn;
		
	}


}
