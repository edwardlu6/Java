import java.util.*;

public class validBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String word = sc.nextLine();
		System.out.println(validBrackets(word));
	}
	
	public static boolean validBrackets(String word) {
		int sum=0;
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i)=='(' || word.charAt(i)=='[' || word.charAt(i)=='{') {
				sum++;
			} else if (word.charAt(i)==')' || word.charAt(i)==']' || word.charAt(i)=='}') {
				sum--;
			}
			
		}
		if (sum==0) {
			return true;
		} else {
			return false;
		}
	}

}
