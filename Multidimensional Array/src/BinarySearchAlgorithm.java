
public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		int key=5;
		double[] arr= {1,2,3,4,5,6};
		System.out.println(binarySearch(arr,key));

	}
	
	public static int binarySearch(double[] list,double key) {
		int low=0;
		int high=list.length-1;
		while (high>=low) {
			int mid=(low+high)/2;
			if (key<list[mid])
				high=mid-1;
			else if (key==list[mid])
				return mid;
			else
				low=mid+1;
		}
		return -1;
	}
}
