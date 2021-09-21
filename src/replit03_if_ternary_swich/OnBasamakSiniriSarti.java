package replit03_if_ternary_swich;

import java.util.Scanner;

public class OnBasamakSiniriSarti {

	public static void main(String[] args) {
		/*

        Verilen iki sayinin (sifirdan buyuk veya sifira esit) toplamini hesaplayan ve yazdiran bir Java programi yazin.

        Verilen tamsayilar veya toplamda 10'dan fazla basamak varsa, "yapamam" yazdirin.
		
		EXAMPLE:

		INPUT :
		Input two integers:

		25

		46

		OUTPUT :

		Sum of the numbers: 71
	*/

		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Lutfen 2 adet sayi giriniz");
	        long x= scan.nextLong();
	        long y= scan.nextLong();
	      
	    
	        if (String.valueOf(x).length()>10 || String.valueOf(y).length()>10 || String.valueOf(x+y).length()>10) {
	            
	            System.out.println("OverFlow");
	        }else  System.out.println(x+y);
	}

}
