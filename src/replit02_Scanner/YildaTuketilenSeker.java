package replit02_Scanner;

import java.util.Scanner;

public class YildaTuketilenSeker {

	public static void main(String[] args) {
		/*
		 * Kullaniciya gunde ne kadar cay ictigini ve ne kadar seker kullandigini sorun.
		 * Yilda kac kg seker kullandigini hesaplayin ve yazdirin.
           1 seker = 1.7 gr
           ornek cikti:
            Yilda 12.41 kg seker kullaniyor.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gunde kac cay ictiginizi girin");
		double cay=scan.nextInt();
		System.out.println("Lutfen cayi kac sekerli ictiginizi girin");
		double seker=scan.nextInt();

		//double gundeTuketilenSeker = cay*seker;

		double yildaTuketilenSeker = (cay*seker*365*1.7)/1000;
		 System.out.println("Yilda "+yildaTuketilenSeker+" kg seker kullaniyor.");
		 scan.close();
		 
	}

}
