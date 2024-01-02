
public class LinearSearch {

	public static void main(String[] args) {
		int key=2;
		double[] arr= {1,3,2,4};
		System.out.println(linearSearch(arr,key));

	}
	
	public static int linearSearch(double[] list, double key) {
		for (int i=0; i<list.length;i++) {
			if (key== list[i])
				return i;
		}
		return -1;
	}

}
