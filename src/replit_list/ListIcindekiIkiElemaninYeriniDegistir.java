package replit_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIcindekiIkiElemaninYeriniDegistir {

	public static void main(String[] args) {
		// 10 elemanli bir liste olusturun.
		// 8. ogeyi 3. ogeyle degistirin.
		
		//INPUT : 
		//String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		//Output:

		//[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		
		List <String>liste =new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        String str= liste.get(2);  //kemal i str ye attim
		liste.set(2, liste.get(7)); // furkani kemalin yerine
		liste.set(7,str); // kemali 7. index e yerlestirdim
		
		System.out.println(liste);
		
	}

}
