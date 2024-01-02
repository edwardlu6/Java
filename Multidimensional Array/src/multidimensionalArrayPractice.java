import java.util.*;

public class multidimensionalArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		double[][] arr = new double[4][4];
		
		//creating a 4x4 matrix
		for (int i = 0; i < 4; i++) {
			for (int j=0;j<4;j++) {
				arr[i][j]=sc.nextDouble();
			}
		}

		// diagonals
		for (int i = 0; i < 4; i++) {
			if (arr.length != arr[i].length)//check if the matrix is a square.
				System.out.println("not a square");
			System.out.println(arr[i][i]);

		}

		// first row
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(arr[i][j]);
			}
		}

		// last column
		for (int j = 3; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.println(arr[i][j]);
			}
		}
		
		int sum=0;
		for (int i = 0; i < 4; i++) {
			for (int j=0;j<4;j++) {
				sum+=arr[i][j];
			}
		}
		
		System.out.println(sum);
		// The method to print multidimensional array.
		System.out.println(Arrays.deepToString(arr));

	}

}
