package replit03_if_ternary_swich;

import java.util.Scanner;

public class GirilenKelimeninSonIkiHarfiniYazdir {

	public static void main(String[] args) {
		/*Kullanicidan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasindan olusan yeni bir String yazdirin

          Kullanicidan alinan isim uzunlugu en az 2 olacaktir.

                         INPUT : Mustafa
                         OUTPUT : fafafa*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir isim girin");
		String isim=scan.next().toLowerCase(); 
	    String sonIkiHarf=isim.substring(isim.length()-2, isim.length());
	    
	    if(isim.length()>2) {
	    	System.out.println(sonIkiHarf+" "+sonIkiHarf+" "+sonIkiHarf);
	    }
		
		
	}

}
