import java.lang.*;
import java.util.*;

public class stringBuilderPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder edward=new StringBuilder("edward");
		

		System.out.println(edward.reverse());
	}
	
	public static String reverse(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
	


}
