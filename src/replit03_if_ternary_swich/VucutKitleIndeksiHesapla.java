package replit03_if_ternary_swich;

import java.util.Scanner;


public class VucutKitleIndeksiHesapla {

	public static void main(String[] args) {
		/*Ask user to their weight and height and type a program with calculates mass index

		HINT : Body Mass Index = Weight (kg) / Square of height (m) kilo/boyunkaresi
		Then give a message to user as following:

		If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 , 
		your weight is ideal If BMI is between 25 and 30, you re fat If BMI is more than or equal to 30, obese

		EXAMPLE :

		INPUT:

		Weight : 71

		Height : 1,72

		OUTPUT :

	Your BMI is : 23.99945916711736 Your weight is ideal
	*/
    Scanner scan= new Scanner(System.in);
    System.out.println("Lutfen boyunuzu cm cinsinden girin");
    double boy=scan.nextDouble();
    System.out.println("Lutfen kilonuzu girin");
    double kilo=scan.nextDouble();
    boy/=100;
    double vki=kilo/(boy*boy);
    
    if (vki<18.5) {
    	System.out.println("Your BMI is : "+vki+" you re weak");
    }
    else if (vki>=18.5 && vki<25) {
    	System.out.println("Your BMI is : "+vki+" your weight is ideal");
    }
    else if(vki>=25 && vki<30) {
    	System.out.println("Your BMI is : "+vki+" you re fat If");
    }
    else System.out.println("Your BMI is : "+vki+" obese"); 
    
  scan.close();
		
	}

}
