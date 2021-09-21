package replit03_if_ternary_swich;

import java.util.Scanner;

public class KelimeninİcineKelimeYerlestirme {

	public static void main(String[] args) {
//Kullanicidan iki isim isteyin ismin karakter sayisi çift sayi ise
// ikinci ismi birincinin ordasina yerlestirin degilse eklenemiyor mesaji verin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki isim girin");
		String isim=scan.next().toLowerCase();
		String isim2=scan.next().toLowerCase();
		
		if (isim.length()%2==0) {
			System.out.println(isim.substring(0, isim.length()/2)+isim2+isim.substring(isim.length()/2, isim.length()));
		}
		else System.out.println("isim1, isim2 ye eklenemiyo");
	

	
	}

}
