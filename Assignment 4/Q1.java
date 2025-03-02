package assignment4;
import java.util.*;
public class Q1 {
	  public static void insertionSort(int[] arr) {
	        for (int j = 1; j < arr.length; j++) {
	            int key = arr[j];
	            int i = j - 1;	            
	            while (i >= 0 && arr[i] > key) {
	                arr[i + 1] = arr[i];
	                i--;
	            }
	            arr[i + 1] = key; 
	        }
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the size: "); 
        int n=sc.nextInt(); 
        int[] arr=new int [n]; 
        System.out.print("Enter array elements: "); 
        for (int i = 0; i <n; i++) { 
            arr[i]=sc.nextInt(); 
        }
        insertionSort(arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        } 
	}
}
