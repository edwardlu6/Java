import java.util.*;
public class exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int[] arr=new int[10];// create an int array arr with size 10.
		//a for loop to ask input 10 times and store the input into the array.
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter an integer");
			
			//to store the input into the array in a reverse order
			arr[arr.length-1-i]=sc.nextInt();
		}
		//print out arr with numbers in reverse order. 
		System.out.println(Arrays.toString(arr));//use Array.toString() to print arr
		sc.close();
	}

}
