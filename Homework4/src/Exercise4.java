import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();//read the number from users' input.
		System.out.println(evenOdd(number));//print out 1(even) or 0(odd) using evenOdd 
		input.close();

	}
	
	//This method is to determine if targeNumber is even or odd
	public static int evenOdd(int targetNumber) {
		if (targetNumber%2==0)//if targetNumber is divisible by 2, it is even.
			return 1;
		else //if targetNumber is not divisible by 2, then it's odd.
			return 0;
	}

}
