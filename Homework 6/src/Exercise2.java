//This homework is completed by Karla Murueta and Edward Lu


import java.util.Scanner;

public class Exercise2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double[][] arr = new double[4][4]; // initializing 2D double array.
		double num = 0; 
		
		System.out.println("Enter a 4 by 4 matrix row by row: ");
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				num = sc.nextDouble(); // read the input number.
				arr[i][j] = num; //store the input number into the 2D array.
			}
		}
		
		
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(arr));
		
		

	}
	
	//the method to calculate the sum of numbers on major diagonal.
	public static double sumMajorDiagonal(double[][] m) {
		
		double sumOfDiagonal = 0;
		
		// a 'for' loop to get numbers on major diagonal.
		for (int i=0; i<m.length; i++) {

			sumOfDiagonal += m[i][i];

		}
		
		return sumOfDiagonal;
		
	}


}