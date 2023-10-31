import java.lang.Math;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double rad = input.nextDouble();//read the radius from users' input
		System.out.println(circleArea(rad));//print out the area of the circle using circleArea method.
		input.close();
	}
	
	//This method to calculate and return the area of the circle
	public static double circleArea(double radius) {
		double area1 = Math.PI * radius * radius;//Using formula to calculate circle area. Then create variable area1 to store the circle area.
		return area1;//return variable area1
		
	}
}
