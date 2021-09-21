package replit_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListtenElemanCikarYeniListteYazdir {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		//bir diziden belirli bir elemani cikarmak ve kalan elemanlari
		//yeni bir diziye koymak ve yeni diziyi yazmak icin bir Java programi yaz

		//Girdi :{1,2,3,4,5,6}

		//eleman:6

		//Cikti : [1,2,3,4,5]
	

		int arr[]= {1,2,3,4,5,6};
		int eleman=6;
		List <Integer> list=new ArrayList<>();
		for (int i=0; i<arr.length ; i++) {
			if (arr[i]!=eleman) {
			list.add(arr[i]);
		}}
		System.out.println(list);

/*	int arr[]= {1,2,3,4,5,6};
	System.out.println("Lutfen bir eleman girin");
	int eleman=scan.nextInt();

	List <Integer> list=new ArrayList<>();
	for (int i=0; i<arr.length ; i++) {
		if (arr[i]!=eleman) {
		list.add(arr[i]);
	}}
	System.out.println(list);*/
	
	}
}
