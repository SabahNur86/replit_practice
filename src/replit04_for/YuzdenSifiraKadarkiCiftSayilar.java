package replit04_for;

public class YuzdenSifiraKadarkiCiftSayilar {

	public static void main(String[] args) {
		/* 5. Soru
		 * 100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
		 * 
		 * OUTPUT : 100 98 96 94 92 … … … … 2 0
		 */

		int sayi = 100;

		while (sayi <= 100 && sayi >= 0) {
			if (sayi % 2 == 0) {
				System.out.print(sayi + " ");

			}
			sayi--;
		}
	}

}