import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();//read the first number
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();//read the second number
		System.out.println(lastDigit(num1,num2));//print out the last digit of the sum using lastDigit method.
		sc.close();
	}
	
	//This method to return the last digit of the sum of two integers.
	public static int lastDigit(int a, int b) {
		
		int sum = a+b;//store the sum of the two integers to the sum variable.
		return sum%10;//return the last digit of the sum.
	}

}
