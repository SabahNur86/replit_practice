package replit02_Scanner;

import java.util.Scanner;

public class AlinanSaatveDakikayiSaniyeyeCevir {

	public static void main(String[] args) {
		// Girilen zamani saniyeye ceviren bir program yaziniz.
		// ornek cikti:
		// 1 saat 10 dakika 50 saniye ==>
		// 4250 saniye
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen saati girin");
		int saat=scan.nextInt();
		System.out.println("Lutfen dakika girin");
		int dakika=scan.nextInt();
		System.out.println("Lutfen saniye girin");
		int saniye=scan.nextInt();


		int saniye1=(dakika*60)+(60*60*saat)+saniye;
		System.out.println(saniye1+" saniye");



		scan.close();
	}

}
