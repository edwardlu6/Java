import java.util.*;

public class exercise3 {
	
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=0;
		double[] arr=new double[10];//create a double array arr with size 10
		// use a for loop to get 10 user's input 
		for (int i=0;i<10;i++) {
			System.out.println("Enter a double value");
			arr[i]=sc.nextDouble(); // store the input to the arr in correct index
		}
		System.out.println(average(arr));
		sc.close();

	}
	// a method to get the average of an int array
	public static double average (int [] array) {
		int sum=0;
		for (int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return (double)sum/array.length;
	}
	
	// a method to get the average of a double array 
	public static double average (double [] array) {
		double sum=0;
		for (int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum/array.length;
	}
	

}
