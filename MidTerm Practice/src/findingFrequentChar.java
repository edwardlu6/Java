import java.util.*;

public class findingFrequentChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = sc.nextLine();
		System.out.println(findSecondMost(word));
		System.out.println(findSecondMost(word));

	}

	public static char findFrequentChar(String word) {

		char mostFrequentChar =' ';
		int  maxCount=0;
		
		for(int i=0; i<word.length();i++) {
			char currentChar=word.charAt(i);
			int count=0;
			for(int j=0; j<word.length(); j++){
				if (currentChar==word.charAt(j)) {
					count++;
				}
				
			}
			if (count>maxCount) {
				maxCount=count;
				mostFrequentChar=currentChar;
			}
		}
		return mostFrequentChar;
		
	}
	
	public static char findSecondMost(String word) {
		char mostChar = findFrequentChar(word);
		char secondFrequentChar = ' ';
		int maxCount=0;
		
		for(int i=0; i<word.length();i++) {
			char currentChar=word.charAt(i);
			int count=0;
			for(int j=0; j<word.length(); j++){
				if (currentChar!=mostChar && currentChar==word.charAt(j)) {
					count++;
				}
				
			}
			if (count>maxCount) {
				maxCount=count;
				secondFrequentChar=currentChar;
			}
		}
		System.out.println(maxCount);
		return secondFrequentChar;
		
	}
}
