package replit05_Method;

public class MetodIleArrayIcindekiMaxveMinDegerler {

	public static void main(String[] args) {
		// Write a method that accepts an integer array as input and prints the minimum and
		// the maximum numbers from given array

		//Input : {3,2,5,4,1,6}

		//Output :

		//min: 1

		//max: 6
		int arr[]={3,2,5,4,1,6};
		arrMinMax(arr);
		
	}

	private static void arrMinMax(int[] arr) {
		int min=0;
		int max=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					min=arr[i];
				}else if (arr[i]>arr[j]) {
					 max=arr[i];
				}
			}
		} System.out.println("min: "+min);
		System.out.println("max: "+max);
		
		
	}

}
