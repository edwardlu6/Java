import java.util.*;

public class findSecondMostChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = input.nextLine();
		System.out.println(secondMost(word));
	}
	
	public static int secondMost(String word) {
		int most = 0;
		int second = 0;
		char mostChar = ' ';
        char secondChar = ' ';
		

		for(int i = 0; i <word.length(); i++){
			char target = word.charAt(i);
			int count = 1;

			
			for (int j = 0; j<word.length();j++){
				if (i!=j && target == word.charAt(j)){
					count ++;
				}
			}
			if (count > most) {
                second = most;
				most = count;
				secondChar = mostChar;
                mostChar = target;
                

			}  else if (count > second && count<most) {
                second = count;
                secondChar = target;
            }
			


		}
		System.out.println(most);
		System.out.println(mostChar);
		System.out.println(secondChar);
		return second;
	}

}
