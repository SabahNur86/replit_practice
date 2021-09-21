package replit05_Method;

public class MetodIleStringiTerstenYazdir {

	public static void main(String[] args) {
		// Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
		// Input : Coding is greate.
		// Output : .etaerg si gnidoC

		
		
		tersten("Coding is greate.");
	}

	private static void tersten(String str) {
		String temp="";
		String strArray[]=str.split("");
		for (int i=strArray.length-1; i>=0; i--) {
			 temp+=strArray[i];
		}
		System.out.println(temp);
		
		
	}

	
		
	}


