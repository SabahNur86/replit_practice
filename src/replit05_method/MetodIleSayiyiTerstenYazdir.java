package replit05_method;

public class MetodIleSayiyiTerstenYazdir {

	public static void main(String[] args) {
		// Write a return method to reverse number.
        // Input : 12345
        // Output : 54321

		tersten(12345);
		
	}

	private static  void tersten(int sayi) {
		String temp="";
		while (sayi>0) {
		 temp+=sayi%10;
		 sayi=sayi/10;
		 
	 } System.out.println(temp);
      
	   
	   
	
	
	}

}
