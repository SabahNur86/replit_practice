package replit03_if_ternary_swich;

import java.util.Scanner;


public class TekrarliHarfKontrolu {

	public static void main(String[] args) {
		//girilen 3 harfli ismin karakterlerinin benzersiz olup olmadigini test eden prog yaziniz.
		 Scanner scan=new Scanner (System.in);
		System.out.println("3 harfli biri isim girin");
		String isim=scan.next();
		
	    System.out.println(isim.charAt(0)==isim.charAt(1)||isim.charAt(0)==isim.charAt(2)||isim.charAt(1)==isim.charAt(2)? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var"); 
		
	}

}