package replit05_method;

public class MetodIleStringIcindekiSayilarinToplami {

	public static void main(String[] args) {
		// Write a method which accepts a String as parameter and prints the sum of the
		// digits, present in the given string.
		// input : ade1r4d3
		// output : 8
		// Hint :
		// Use Character.isDigit()
		// Integer.valueOf()
        /*
         * Bir String'i parametre olarak kabul eden ve verilen string'de bulunan
         * rakamlarin toplamini yazdiran bir metod yazin.
         */

		rakamlarToplami("ade1r4d3");
	
	}

	 private static void rakamlarToplami(String str) {
	        String arr[]=str.split("");
	        int toplam=0;
	        for(String each:arr) {
	            if (Character.isDigit(each.charAt(0))) {
	                toplam+=Integer.valueOf(each);
	            }
	        
	            
	        }System.out.println(toplam);
		
	}

	
}
