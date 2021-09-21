package replit02_Scanner;

import java.util.Scanner;

public class ExplicitNarrowingCasting {

	public static void main(String[] args) {
		//Kullanicidan bir Float deger girmesini isteyin, bu sayiyi short degisken tipine
		// donusturun ve konsolda yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ondalikli birsayi girin");
		float sayi=scan.nextFloat();
		short sayi2=(short)sayi;
		
        System.out.println(sayi2);
	scan.close();
	}

}
