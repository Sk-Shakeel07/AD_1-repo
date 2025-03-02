package assignment4;
import java.util.*;
public class Q3 {
	public static void bubbleSort(int[] a) {
        int n = a.length;        
        for (int i = n; i >= 1; i--) {           
            for (int j = 1; j < i; j++) {                
                if (a[j - 1] > a[j]) {                    
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();
	        int[] array = new int[n];	        
	        System.out.print("Enter "+n+" elements: ");
	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	        }	        
	        bubbleSort(array);	        
	        System.out.print("Sorted array: ");
	        for(int i = 0;i<n;i++){
	            System.out.print(array[i] + " "); 
	        } 
	}
}
