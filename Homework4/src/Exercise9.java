import java.util.*;
public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to test:");
		String test = sc.nextLine();
		
		validatePalindrome(test);
		sc.close();
	}
	
	//This method is to check if a word is a palindrome.
	public static void validatePalindrome(String word) {
		String new_word="";
		boolean isPalindrome = true;
		
		//This for loop is to keep all the letters and remove space.
		for (int i=0;i<word.length();i++) {
			if (word.charAt(i)!=' ') {
				new_word+=word.charAt(i);
			}
				
		}
		
		new_word=new_word.toLowerCase();//convert the word to lower case
		//This for loop is check if the string is the same in normal and reversed order
		for (int j=0;j<new_word.length();j++) {
			if (new_word.charAt(j)!=new_word.charAt(new_word.length()-1-j)) {
				isPalindrome = false;//the word is not palindrome if the two chars are unequal.
			} 
		}
		
		//use if statement to print out the two different conditions(palindrome or not palindrome).
		if (isPalindrome==false) {
			System.out.println("Not a palindrome");
		} else if (isPalindrome==true) {
			System.out.println("Palindrome");
		}
	}

}
