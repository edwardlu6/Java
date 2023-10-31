import java.util.*;
//Check textbook for better program. Page 189.
public class findPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(findPrime(num));
		
		
	}
	
	public static boolean findPrime(int number) {
		boolean isPrime = true;
		if (number<2) {
			return false;
		}
		
		for (int divisor = 2; divisor <= number/2; divisor++) {
			if (number%divisor==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

}
