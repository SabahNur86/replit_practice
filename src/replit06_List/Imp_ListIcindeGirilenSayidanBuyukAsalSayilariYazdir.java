package replit06_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imp_ListIcindeGirilenSayidanBuyukAsalSayilariYazdir {

	public static void main(String[] args) {
		//Bir tamsayiyi girdi olarak kabul eden ve girdiden
		// buyuk ilk 10 asal sayiyi ekrana yazdiran bir program yaziniz.

		//Girdi : 5

		//Cikti : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		
		List <Integer> liste=new ArrayList<>();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi girin");
		int sayi=scan.nextInt();
		int adedi=0;
		int count=0;
		sayi++;
		
		while(count<10) {
		    for(int i=2; i<=sayi; i++) {
		       if(sayi%i==0){
			       adedi++;}
		    }
		       if (adedi==1) {
			     liste.add(sayi);
			     count++;}
		     
		       sayi++;
		       adedi=0;
	             
		    }
		System.out.println(liste);
		}
}
		
