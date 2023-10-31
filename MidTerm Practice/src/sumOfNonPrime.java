import java.util.Scanner;

public class sumOfNonPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int number=sc.nextInt();
		System.out.println(sumOfNonPrime(number));
	}
	
	public static int sumOfNonPrime(int number) {
		int sum=0;
		if (number<10) {
			if (!findPrime(number)) {
				return number;
			}
		}
		
		while (number>10) {
			if(!findPrime(number%10)) {
				sum+=number%10;
			}
			number/=10;
			
		}
		if (!findPrime(number)) {
			sum+=number;
		}
		return sum;
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
