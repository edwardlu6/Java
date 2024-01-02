import java.util.*;

public class exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list");
		int num = sc.nextInt(); // read the user's input to create an array with desired size
		int[] list = new int[num]; // create an int array list with size of input num
		
		// read user's input and store it into list array in order
		for (int i = 0; i < num; i++) {
			list[i] = sc.nextInt();
		}
		// if list array is sorted in an increasing order, isSorted(list) returns true
		if (isSorted(list)) { 
			System.out.println("The list is already sorted");
		} else if (isSorted(list)==false) { // if list array is not sorted in an increasing order, isSorted(list) returns false
			System.out.println("The list is not sorted");
		}
		
	}
	
	// a method to check if argument array list is sorted in increasing order
	public static boolean isSorted(int[] list) {
		
		
		for (int i=0;i<list.length-1;i++) {
			if(list[i]>list[i+1]) // if the next number is smaller than the previous one, return false
				return false;
		}
		
		// if no problem, return true
		return true;
		
		
			
	}

}
