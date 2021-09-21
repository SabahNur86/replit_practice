package replit05_method;

import java.util.Arrays;

public class MetodIleStringiArrayIcindeYazdir {

	public static void main(String[] args) {
		//Create a custom return type method accepts a name as parameter and prints the name as a char array.
				//(do not use toCharArray() method)
			//	Input : John
			//	Output :[J, o, h, n]
		
		array("John");
		
	}

	private static void array(String string) {
		
		String arr[]=string.split("");
		System.out.println(Arrays.toString(arr));
		
	}

}
