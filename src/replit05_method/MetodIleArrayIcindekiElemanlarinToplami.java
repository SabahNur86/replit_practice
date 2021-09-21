package replit05_method;

public class MetodIleArrayIcindekiElemanlarinToplami {

	public static void main(String[] args) {
		//Write a method that accepts an array as parameter and returns sum off all elements in the array
		//Then print the result in the main method.

		//input : {1,2,3,4,5,6,7,8};
		//output: 36
	int arr[]={1,2,3,4,5,6,7,8};
	int toplam=	arrToplam(arr);
	
	System.out.println(toplam);
	}

	private static int arrToplam(int[] arr) {
		int sum=0;
		for(int each:arr) {
		sum+=each;
	}
		
	return sum;
	}
	

}
