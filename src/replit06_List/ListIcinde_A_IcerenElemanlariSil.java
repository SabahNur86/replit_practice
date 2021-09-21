package replit06_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListIcinde_A_IcerenElemanlariSil {

	public static void main(String[] args) {
		// Girdi olarak verilen listedeki isimlerden 'a' harflerini icerenleri silen bir
		// program yaziniz.
		// INPUT :
		// list1={"Ali","Veli","Ayse","Fatma","Omer"}

		// OUTPUT :

		// [Veli,Omer]
	
	List <String> liste=new ArrayList<>();
	liste.addAll(Arrays.asList("Fatma","Veli","Ayse","Omer","Ali"));
		
		System.out.println(liste);
       for (int i=0; i<liste.size(); i++) {
	
    	   if(liste.get(i).contains("a")||liste.get(i).contains("A")) {
    		   liste.remove(liste.get(i));
    	   }
          }
	System.out.println(liste);
	
	}
}
