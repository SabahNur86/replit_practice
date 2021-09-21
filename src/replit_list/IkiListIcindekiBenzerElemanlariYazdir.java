package replit_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IkiListIcindekiBenzerElemanlariYazdir {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// Iki String Dizisi arasindaki ortak ogeleri bulan bir program yazin
		// (buyuk/kucuk harf duyarliligi olmadan)

		//Girdi1 : {John,Brad,Ange,Sofia,Emily}

		//Girdi2 : {sofya,brad,zarafet,emily,hazel}

		//Cikti: [sofya,brad,emily]
		
		List <String> list=new ArrayList<>(Arrays.asList("John","Brad","Ange","Sofia","Emily"));
		
		List <String> list1=new ArrayList<>(Arrays.asList("sofia","brad","zarafet","emily","hazel"));
		List <String> list3= new ArrayList<>();
		for (int i=0; i<list.size(); i++) {
			for (int j=0; j<list1.size(); j++) {
				if(list.get(i).equalsIgnoreCase(list1.get(j))) {
					list3.add(list.get(i));
				}
			}
		}
			
	System.out.println(list3);
		
		
/*		int count=0;
		List <String> liste1= new ArrayList<>();

		do {
		System.out.println("Lutfen list1 icin eleman girin");
		liste1.add(scan.nextLine());
		count++;
		}while(count<5);

		List <String> liste2= new ArrayList<>();

		count=0;
		do {

			System.out.println("Lutfen list2 icin eleman girin");
			liste2.add(scan.nextLine());
			count++;
			}while(count<5);

		System.out.println(liste1);
		System.out.println(liste2);
		List <String> liste3= new ArrayList<>();
		for (int i=0; i<liste1.size(); i++) {
			for (int j=0; j<liste2.size(); j++) {
				if(liste1.get(i).equalsIgnoreCase(liste2.get(j))) {
					liste3.add(liste1.get(i));
				}
			}
		}

	System.out.println(liste3);*/
	}

}
