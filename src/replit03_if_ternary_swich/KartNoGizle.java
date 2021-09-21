package replit03_if_ternary_swich;

import java.util.Scanner;

public class KartNoGizle {

	public static void main(String[] args) {
	/*	Kullanicidan isim soyismini ve kart numarasini isteyin  asagidaki formatta yazdirin
	 * (Initials for name and surname should be uppercase)
       (Check credit card number, if there arent 16 digit print Invalid credit card number

		Input :

		John White 1234234534561478

		Output :

		Name : J* W**

		CCN : ** ** **** 1478
	*/
	
		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi giriniz");
		String isim=scan.nextLine();
		System.out.println("Soyisminizi giriniz");
		String soyisim=scan.nextLine();
		System.out.println("Kart no girin");
		String kkNo=scan.nextLine();
		
		String isimDuzenlenmis= isim.substring(0,1).toUpperCase()+
	            isim.substring(1).replaceAll("\\w", "*"
	          		   );		
			String soyisimDuzenlenmis= soyisim.substring(0,1).toUpperCase()+
			     soyisim.substring(1).replaceAll("\\S","*");		
			String kkNoDuzenlenmis= "**** **** ****"+" "+ kkNo.substring(12);
			System.out.println("Isim-soyisim :"+isimDuzenlenmis+ " "+ soyisimDuzenlenmis
					+ "\nkart no :"+kkNoDuzenlenmis);
		
	scan.close();
	
	}

}
