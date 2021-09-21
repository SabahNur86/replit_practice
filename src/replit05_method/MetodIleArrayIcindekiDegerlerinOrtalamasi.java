package replit05_method;

public class MetodIleArrayIcindekiDegerlerinOrtalamasi {

	public static void main(String[] args) {
		//Dizi elemanlarinin ortalama degerini hesaplayan bir java programi yaziniz.

		//input[]= {1,2,3,4,5,6,7}

		//Output : 4
		
		int arr[]={1,2,3,4,5,6,7};
		int toplam=0;
		int ort=0;
		for (int i=0; i<arr.length; i++) {
			toplam+=arr[i];
		}ort=toplam/arr.length;
	
	System.out.println(ort);
	}
	

}
