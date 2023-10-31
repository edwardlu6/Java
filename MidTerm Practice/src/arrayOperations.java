import java.util.*;

public class arrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] array= {3,4,6,5,7};
		System.out.println(changePrimeElement(array));
		double[] result=changePrimeElement(array);
		System.out.println(Arrays.toString(result));
	}
	
	public static int findMax(double[] array) {
		double maxValue=array[0];
		int maxIndex=0;
		for (int i=1; i<array.length;i++) {
			if (array[i]>=maxValue) {
				maxValue=array[i];
				maxIndex=i;
			}
		}
		System.out.println(maxValue);
		return maxIndex;
	}
	public static int findMin(double[] array) {
		double minValue=array[0];
		int minIndex=0;
		for (int i=1; i<array.length;i++) {
			if (array[i]<=minValue) {
				minValue=array[i];
				minIndex=i;
			}
		}
		System.out.println(minValue);
		return minIndex;
	}
	public static double findAverage(double[] array) {
		double sum=0;
		for (int i=0; i<array.length;i++) {
			sum+=array[i];
		}
		double average=sum/array.length;
		return average;
	}
	public static void aboveAverage(double[] array) {
		for (int i=0; i<array.length;i++) {
			if (array[i]>findAverage(array)) {
				System.out.println(array[i]);
			}
		}
	}
	public static void belowAverage(double[] array) {
		for (int i=0; i<array.length;i++) {
			if (array[i]<findAverage(array)) {
				System.out.println(array[i]);
			}
		}
	}
	 public static int[] addNewElement(int[] myArray, int newElement) {

	       // create a new array of a bigger size (+ one element)
	       int newArray[] = new int[myArray.length + 1];

	       // insert the elements from the old array into the new one
	       for (int i = 0; i < myArray.length; i++)
	           newArray[i] = myArray[i];

	       newArray[myArray.length] = newElement;
	       return newArray;
	   }
	 public static double[] changePrimeElement(double[] array) {
		 double[] newArray=new double[array.length];
		 for (int i=0; i<array.length;i++) {
			 if (findPrime(array[i])==true) {
				 newArray[i]=-1;
			 } else {
				 newArray[i]=array[i];
			 }
		 }
		 return newArray;
	}
	 public static boolean findPrime(double number) {
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
