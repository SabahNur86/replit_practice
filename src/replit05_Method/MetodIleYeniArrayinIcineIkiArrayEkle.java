package replit05_Method;

import java.util.Arrays;

public class MetodIleYeniArrayinIcineIkiArrayEkle {

	public static void main(String[] args) {
		// Write a return method that accepts 2 integer Arrays as parameters
        // And adds 2 array into a new Array and prints it.

		//Input1={1,2,3,4}
		//Input2={5,6}
		//Output={1,2,3,4,5,6}
		//2 tamsayi Diziyi parametre olarak kabul eden ve
        // yeni bir Diziye 2 dizi ekleyen ve return eden metod yazin.

        int arr[] = { 1, 2, 3, 4 };
        int arr1[] = { 5, 6 };
        int arr2[] = arrEkle(arr, arr1);
        System.out.println(Arrays.toString(arr2));
    }
    private static int[] arrEkle(int[] arr, int[] arr1) {
        int arr2[] = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            int j = arr.length;
            int k = 0;
            while (k < arr1.length) {
                arr2[j] = arr1[k];
                k++;
                j++;
            }
        }
        return arr2;
    }   }