package replit04_for;

public class TekrarEdenKarakterler {

	public static void main(String[] args) {
	/*	Bir String icerisinde yinelenen karakterleri donduren bir kod yaziniz.

		Input :

		String str=�Javaisalsoeasy�

		Output: a s
	*/
	
		String str="Javaisalsoeasy";
		String temp="";
	
		for (int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
		if(	str.substring(i,i+1).equals(str.substring(j,j+1))) {
		    
		if(!temp.contains(Character.toString(str.charAt(i)))) {
			temp+= str.charAt(i)+" ";
	     }}}}
	
		System.out.print(temp);
	}
		
}

