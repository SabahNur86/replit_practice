package replit02_Scanner;

import java.util.Scanner;

public class ExplicitNarrowingCasting2 {

	public static void main(String[] args) {
		//Kullanici tarafindan girilen DOUBLE sayiyi tam sayiya ceviren bir program yaziniz.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ondalikli birsayi girin");
		double sayi=scan.nextDouble();

		int sayi1= (int)sayi;
		System.out.println(sayi1);
	scan.close();
	}

}
