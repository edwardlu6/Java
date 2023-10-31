import java.util.*;
import java.lang.*;

public class inClassPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String word=sc.nextLine();
		String word2="edward";
		System.out.println(uniqueChar(word));
		countOccurrences(word);
		System.out.println(checkAnagrams(word,word2));

	}
	
	public static int method1(String word, char input) {
		char currentChar=input;
		int times=0;
		for (int i=0;i<word.length();i++) {
			if(word.charAt(i)==currentChar) {
				times++;
			}
		}
		return times;
	}

	public static String uniqueChar(String word) {
	    String uniqueChar = "";
	    for (int i = 0; i < word.length(); i++) {
	        char currentChar = word.charAt(i);
	        boolean isUnique = true;

	        for (int j = 0; j < uniqueChar.length(); j++) {
	            if (currentChar == uniqueChar.charAt(j)) {
	                isUnique = false;
	                break;
	            }
	        }

	        if (isUnique) {
	            uniqueChar += currentChar;
	        }
	    }
	    return uniqueChar;
	}

	
    public static void countOccurrences(String input) {
        String unique=uniqueChar(input);
        for (int i = 0; i < unique.length(); i++) {
        	char currentChar=unique.charAt(i);
        	int count=0;
            for (int j=0;j<input.length();j++) {
            	if(currentChar==input.charAt(j)) {
            		count++;
            	}
            }
            System.out.print(currentChar);
            System.out.println(count);
        }
        
    }
    public static int checkAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return 1;
        } else {
            boolean isAnagrams = true;  // Assume they are anagrams until proven otherwise

            for (int i = 0; i < word1.length(); i++) {
                char currentChar = word1.toLowerCase().charAt(i);
                boolean charFound = false;

                for (int j = 0; j < word2.length(); j++) {
                    if (currentChar == word2.toLowerCase().charAt(j)) {
                        charFound = true;
                        break;
                    }
                }

                if (!charFound) {
                    // If a character from word1 is not found in word2, they are not anagrams
                    isAnagrams = false;
                    break;
                }
            }

           if (isAnagrams) {
        	   return 0;
     
           } else {
        	   return 1;
           }
        }
    }

		
}

