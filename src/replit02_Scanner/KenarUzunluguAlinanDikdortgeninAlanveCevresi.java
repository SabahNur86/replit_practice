package replit02_Scanner;

import java.util.Scanner;

public class KenarUzunluguAlinanDikdortgeninAlanveCevresi {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini alin ve dikdortgenin alanini ve cevresini konsola yazdiran bir program yazin.
		//ornek cikti:
			//Alan: 32
			//cevre: 24
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin kisa ve uzun kenarini girin");

		  int a=scan.nextInt();
		  int b=scan.nextInt();
		  int alan=a*b;
		  int cevre=2*(a+b);

		System.out.println("Alan: "+alan);
		System.out.println("Cevre: "+cevre);

		  scan.close();
		  
	}

}
