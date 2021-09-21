package replit02_Scanner;

import java.util.Scanner;

public class AlinanSayininKupununYarisi {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin ve sayinin kupunun yarisini konsola yazdiran bir program yazin.
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sayi girin");
		int sayi=scan.nextInt();
		int sayisonuc=(sayi*sayi*sayi)/2;
		System.out.println(sayisonuc);
		scan.close();
	}

}
