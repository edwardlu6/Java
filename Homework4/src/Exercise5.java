import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();//read the first number from users' input
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();//read the second number from users' input
		findingMultiples(num1,num2);
	}
	
	//This method is to determine if the second number is a multiple of the first number.
	public static void findingMultiples(int a, int b) {
		if (a==0) {
			System.out.println(a +" cannot be a divisor.");
		} else if (b%a==0) //if the second number is divisible by the first, then the second is a multiple of the first number
			System.out.println(b + " is a multiple of " + a);
		else //Conversely, if the second number is not divisible by the first, then the second is not a multiple of the first number
			System.out.println(b + " is not a multiple of " + a);
		
	}

}
