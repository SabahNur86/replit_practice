package replit04_for;


import java.util.Scanner;



public class EbobEkok {

	public static void main(String[] args) {
		/* 2. Soru
		 * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti:
		 * 
		 * 30 ve 40 icin GCD = 10 bu iki sayının da ortak olarak bölündüğü en büyük sayı 10
		 * yani 
		 * 
		 * 30 ve 40 icin LCM = 120 bu iki sayının çarpımının ebob a bölünmesiyle ekok bulunur
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen iki tam sayı girin");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int ebob=0;

		//int arr[]= new int [11];
	
		  for (int i=1; i<sayi1 && i<sayi2; i++) {
			
		
	       	if(sayi1%i==0 && sayi2%i==0) {
		       // arr[i]=i;              // ebob un içine sırasıyla ortak bölünenler yerleşiyor ve bize
	                                     //en büyüğünü veriyor onu görmek içindi       		
		        ebob=i;
	       	  
	       	} 		
		  }
		
		  int ekok=sayi1*sayi2/ebob;
		  System.out.println("GCD = " + ebob);
		  System.out.println("LCM = " + ekok);
		 // System.out.println("ebob"+ebob);
		 // System.out.println("ekok"+ekok); 		
		  //System.out.println(arr[arr.length-1]);		
	       		
	
     scan.close();
	}

}
