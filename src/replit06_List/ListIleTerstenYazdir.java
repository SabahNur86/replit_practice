package replit06_List;

import java.util.Arrays;
import java.util.Scanner;

public class ListIleTerstenYazdir {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin. Kullanicidan alinan cumleyi
		// parametre olarak kabul edin, Array kullanarak cumleyi ters cevirin
		// ve sonucu ana metoda String olarak donduren bir Method yazin.

        // Not: Buyuk kucuk harf bosluk ve karakterler degistirilmeyecektir

		Scanner scan=new Scanner(System.in);
		System.out.println("String girin");
		String str=scan.nextLine();
		
		String temp=terstenStr(str);
		
		
	}

	private static String terstenStr(String str) {
		String arr[]=str.split("");
		System.out.println(Arrays.toString(arr));
		String temp="";
		for (int i=arr.length-1; i>=0; i--) {
			temp+=arr[i];
		}
		System.out.println(temp);
				return temp;
		
	}

}
