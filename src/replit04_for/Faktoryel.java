package replit04_for;

import java.util.Scanner;

public class Faktoryel {

	public static void main(String[] args) {
		/* 4. Soru
		 * Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi
		 * yazıniz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=6*5*4*3*2*1=720
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("faktoriyelini almak istediğiniz sayıyı girin");
		int sayi=scan.nextInt();
		int fak=1;
		for(int i=sayi; i>0; i--) {
			fak*=i;
	}
		System.out.println("Girdiğinizi sayının faktoryeli = "+fak);

		
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz : ");
		int sayi = scan.nextInt();
		int faktoriyel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;

		if (sayi == 6) {
			System.out.println("6!=6.5.4.3.2.1= " + faktoriyel);
		} else {
			System.out.println("Girdiginiz sayinin faktoriyeli : " + faktoriyel);
		}
	
		}
		*/
scan.close();
}
}
