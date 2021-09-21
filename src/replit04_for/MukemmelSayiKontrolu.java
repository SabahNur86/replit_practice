package replit04_for;

import java.util.Scanner;

public class MukemmelSayiKontrolu {

	public static void main(String[] args) {
		/* 7. Soru
		 * Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		 * 
		 * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi
		 * bir sayı Mükemmel Sayı olarak bilinir.
		 * 
		 * 
		 * Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir.
		 * 
		 * ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayi girin");
		int sayi=scan.nextInt();
		int toplam=0;
		for (int i=1; i<sayi; i++) {
		  if (sayi%i==0) {
			  toplam+=i;
		  } }
		  if(toplam==sayi) {
			  System.out.println(sayi+" Mukemmel Sayidir.");
		  }
		  else System.out.println(sayi+" Mukemmel Sayidir degildir.");
		scan.close();
		
	}

}
