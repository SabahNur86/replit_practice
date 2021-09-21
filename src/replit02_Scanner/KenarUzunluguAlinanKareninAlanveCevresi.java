package replit02_Scanner;

import java.util.Scanner;

public class KenarUzunluguAlinanKareninAlanveCevresi {

	public static void main(String[] args) {
		// Kullanicidan karenin kenar uzunlugunu alin ve karenin alanini ve cevresini konsola yazdiran bir program yazin.
		// Ornek Cikti :
		// Alan: 9
		// Cevre: 12
		
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Lutfen karenin bir kenarinin uzunluuunu girin");
		   int kenar=scan.nextInt();
		   int alan=kenar*kenar;
		   int cevre=4*kenar;
		   System.out.println("Alan: "+alan);
		   System.out.println("Cevre: "+cevre);
		   scan.close();
	}

}
