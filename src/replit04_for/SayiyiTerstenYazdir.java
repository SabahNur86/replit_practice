package replit04_for;

import java.util.Scanner;

public class SayiyiTerstenYazdir {

	public static void main(String[] args) {
		//Kullanicinin girdigi sayiyi tersine ceviren bir java programi yaziniz.

		//Input :1238

		//Output :Girilen Numananin Tersi: 8321
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin");
		int sayi=scan.nextInt();
		int tersten = 0;
		
		
	    while (sayi>0) {
		tersten=tersten*10+(sayi%10);
		sayi/=10;
       	}
		
		System.out.println("Girilen Numananin Tersi:" +tersten);
		
		scan.close();
	}

}
