package replit03_if_ternary_swich;

import java.util.Scanner;

public class GirilenKaraktereGoreMesaj {

	public static void main(String[] args) {
	/*	Char degisken yanitinin degerini test eden ve asagidaki eylemleri gerceklestiren bir
	 *  switch ifadesi yazin:

			yanit a ise, "talebiniz isleniyor"

			yanit b ise, "yine de ilginiz icin tesekkur ederiz"

			yanit c ise, "uzgunuz, su anda herhangi bir yardim yok"
			yanitin diger degeri icin , "Gecersiz giris, lutfen tekrar deneyin!"
			yazdirin

	*/
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a character");
	    char karakter=scan.next().toLowerCase().charAt(0);
	    
	    switch (karakter) {
		case 'a':
			System.out.println("Your request is being processed");
			break;
        case 'b':
        	System.out.println("Thank you anyway for your consideration");
			break;
        case 'c':
        	System.out.println("Sorry, no help is currently available");
	        break;

		default:System.out.println("Invalid entry, please try again!");
			break;
		}
	
	
	
	}

}
