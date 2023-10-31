import java.lang.Math;
import java.util.*;
public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();//read the first number from users' input
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();//read the second number from user's input
		System.out.println(randomInteger(num1,num2));

	}
	
	//This method is to find a random integer between the range(a,b)
	public static int randomInteger(int a, int b) {
		int num = (int) (a+Math.random()*(b-a+1));//Using Math.random to generate a random number and store it in an int variable num.
		return num;//return the random integer num
	}

}
