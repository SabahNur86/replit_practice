package replit03_if_ternary_swich;

import java.util.Scanner;

public class İstenenAyinGunSayisi {

	public static void main(String[] args) {
		/*Bir aydaki gun sayisini hesaplayan bir Java programi yaziniz.
		 *
		INPUT:
		Ay Numarasi:
		2
		Yil :
		2016
		OUTPUT :
		Subat 2016 29 Gundur.
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Yilin hangi ayinin(sayisal) gun sayisini ogrenmek istediginizi girin :");
		int kacinciAy=scan.nextInt();
		System.out.println("Yili girin");
		int yil=scan.nextInt();
		
		
		switch(kacinciAy) {
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case(12):
		System.out.println("Girdi�iniz ay 31 g�n i�erir.");
	break;
		case(4):
		case(6):
		case(9):
		case(11):
			System.out.println("Girdi�iniz ay 30 g�n i�erir.");
	break;
		
		default : 
			if (kacinciAy==2) {
				if (yil%4!=0){
					System.out.println("Girdiginiz yilda �ubat 28 g�n i�erir.");}
			    else if(yil%100!=0) {
						System.out.println("Girdi�iniz yilda �ubat 29 g�n i�erir");}
			    else if(yil%400==0) {
						System.out.println("Girdi�iniz yilda �ubat 29 g�n i�erir");}
					
				}	else System.out.println("Ge�erli bir ay numarasi girin");
		 
		}
	}
}
