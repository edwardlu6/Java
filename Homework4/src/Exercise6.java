import java.lang.Math;//import this package to use the random number
public class Exercise6 {

	public static void main(String[] args) {
		
		System.out.println(randomLetter());//print out the random char.
	}
	
	//This method to return a random letter in the alphabet
	public static char randomLetter() {
		char letter = (char) ((int)(65 + Math.random() * 26));//The first char 'A' starts with 65. The range of char is (65,90). 
		return letter;//return the random char variable letter
		
	}

}
