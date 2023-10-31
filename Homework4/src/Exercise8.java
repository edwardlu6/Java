import java.util.*;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to test");
		int test=sc.nextInt();
		reverseOrder(test);
		sc.close();
		
	}
	
	//This method is to reverse of order of a number
	public static void reverseOrder(int number) {
		int sum=0;
		if (number < 10)//If the number is less than 10, then it does not need to be reversed.
			System.out.println(number);
		else { 
			while (number >= 10) { //If the number is greater than or equal to 10, then reverse its order.
				sum=sum*10+number%10;
				//System.out.print(sum);//find the last digit.
				number/=10;//divide the number by 10 to continue
			}
			sum=sum*10+number;
			System.out.print(sum);//print out the digit when number after looping is less than 10.
		}
	}

}
