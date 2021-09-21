package replit07_varargs;

public class VarargsIleElemanlarinToplami {

	public static void main(String[] args) {
		// Birden fazla tamsayiyi parametre olarak kabul eden
		// ve tamsayilarin toplamini return eden metod yazin.
		// Girdi =15 toplam(1,2) Cikti=3
		/*
		 * Write a return method that accepts more than one integer 
		 * as parameter and prints the sum of integers Method name = sum 
		 * if you call method like that sum(1,2,3) output =6 sum(1,2,3,4,5) 
		 * output =15 sum(1,2) output=3
		 */

		sum(1,2,3);
		
	}

	private static void sum(int ... i) {
		int toplam=0;
		for (int each:i) {
		  toplam+=each;
		
	}System.out.println(toplam);

	}
}
