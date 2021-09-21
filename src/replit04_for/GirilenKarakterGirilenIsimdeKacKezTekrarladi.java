package replit04_for;

import java.util.Scanner;

public class GirilenKarakterGirilenIsimdeKacKezTekrarladi {

	public static void main(String[] args) {
		/* 1. Soru
		 * Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */
	

	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen bir isim girin");
	String isim=scan.nextLine();
	
	System.out.println("Lütfen bir karakter girin");
	char karakter=scan.next().charAt(0);
	
	int count=0;
	for (int i=0; i<isim.length(); i++) {
		if (isim.charAt(i)==karakter) {
			count++;
		}
	}
	System.out.println("Number of "+karakter+" = "+count);
	
	//System.out.println("Girdiğiniz karakter "+karakter+" girdiğiniz isimde "+count+" defa geçiyor.");
	
	
	
	
	}

}
