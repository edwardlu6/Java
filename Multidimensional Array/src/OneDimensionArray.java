
public class OneDimensionArray {

	public static void main(String[] args) {
		double[] arr={1.4,2.0,2.0,3.0,2.0};
		
		// To find the max element.
		double maxValue=arr[0];
		int maxIndex=0;
		for (int i=0; i<arr.length;i++) {
			if (arr[i]>maxValue) {
				maxValue=arr[i];
				maxIndex=i;
			}
		}
		System.out.println(maxValue);
		System.out.println(maxIndex);
		
		
		// To copy an array
		int[] a1= {1,2,3};
		int[] a2= {7,8,4};
		
		for (int i=0; i<a1.length; i++) {
			a2[i]=a1[i];
			
			System.out.println(a2[i]);
		}
		
		
		
	}

}
