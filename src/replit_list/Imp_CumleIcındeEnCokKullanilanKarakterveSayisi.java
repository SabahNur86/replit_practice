package replit_list;

import java.util.Arrays;
import java.util.Scanner;

public class Imp_CumleIcındeEnCokKullanilanKarakterveSayisi {

	public static void main(String[] args) {

		// Kullanicidan girdi olarak bir String almak icin
		// bir Java programi yazin ve o karakter dizisinde olusan
		// maksimum karakteri bulun. (Buyuk/kucuk harf duyarliligini yoksay)
		// String str="agile team replit soru cozumune hosgeldiniz";
		
		Scanner scan=new Scanner (System.in); 
		System.out.println("Bir string girin");
		String str=scan.nextLine();
		str=str.replaceAll("\\s","");
		
		String arr[]=str.split("");
		
		int harfSayisi[]=new int[arr.length];
		
		for (int i=0; i<harfSayisi.length; i++) {
			harfSayisi[i]=1;
			for (int j=i+1; j<harfSayisi.length; j++ ) {
				if(arr[i].equalsIgnoreCase(arr[j]))
					
				harfSayisi[i]++;
			}
		}
          int max=0;
          String karakter="";
          for (int i=0; i<harfSayisi.length; i++) {
        	  if(max<harfSayisi[i]) {
        		  max=harfSayisi[i];
        	      karakter=arr[i];
          }
          }System.out.println("en cok tekrar eden karakter : "+karakter+" dir "+max+" kere tekrar etmistir");
		
	}
	}	   