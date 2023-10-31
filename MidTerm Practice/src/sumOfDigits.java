import java.util.*;
import java.text.*;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		System.out.println(sumOfDigits(number));
	}
	
	public static int sumOfDigits(int number) {
		// Handle negative numbers
        number = Math.abs(number);
        
		int sum = 0;
		
		if (number < 10) {
			return number;
		}
		
		while (number>=10) {
			sum+=number%10;
			number/=10;
		}
		sum+=number;
		
		return sum;
		
	}

}
