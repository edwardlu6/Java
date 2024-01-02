import java.util.*;

public class exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=1;
		int[] arr=new int[100];//create an int array arr with size 100.
		// a while loop to read user's input until a 0 is inputed. 
		while (true) {
			System.out.print("Enter the integers between 1 and 100:");
			num=sc.nextInt();
			//if the num is between 1 and 100. the corresponding number in arr increases. 
			if (num<101&&num>0) {
				arr[num-1]++;
			} else if (num==0) { // if num is 0, while loop will be terminated.
				break;
			} 
		}
		//A for loop to iterate all numbers in arr.
		for (int i=0;i<100;i++) {
			// An if condition to print only the numbers larger than 0 with their index.
			if (arr[i]!=0) {
				if (arr[i]==1)
				System.out.println((i+1) +" occurs "+ arr[i]+" time");
				else
					System.out.println((i+1) +" occurs "+ arr[i]+" times");  
			}
		}
		
	}

}
