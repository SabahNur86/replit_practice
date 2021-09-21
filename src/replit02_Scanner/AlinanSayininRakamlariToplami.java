package replit02_Scanner;

import java.util.Scanner;

public class AlinanSayininRakamlariToplami {

	public static void main(String[] args) {
//		Kullanicidan uc basamakli bir sayi girmesini ve bu sayinin basamaklarinin toplamini bulmasini isteyin.
//		ornek cikti:
//		Verilen tamsayinin rakamlari toplami 10'dur.

		 Scanner scan=new Scanner(System.in);
		 System.out.println("3 basamakli bir sayi girin.");
		 int sayi=scan.nextInt();
		 
		 int rakamlarToplami=0;
		 int rakam=sayi%10;

		 rakamlarToplami+=rakam;
		 sayi/=10;

		 rakam=sayi%10;
		 rakamlarToplami+=rakam;
		 sayi/=10;

		 rakam=sayi%10;
		 rakamlarToplami+=rakam;

		 System.out.println("Verilen tamsayinin rakamlari toplami "+rakamlarToplami+"'dur.");

		scan.close();
	}

}
