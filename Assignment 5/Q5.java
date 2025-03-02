package assignment6_AD;
import java.util.*;
public class Q5 {
	 public static int MaxAppear(int[] arr) {
	        int maxCount = 0;
	        int maxElement = arr[0]; 
	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            } 
	            if (count > maxCount) {
	                maxCount = count;
	                maxElement = arr[i];
	            }
	        }
	        return maxElement; 
	    }	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of array: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.print("Enter the "+n+" array elements are: ");
			for(int i = 0;i<n;i++){
			arr[i] = sc.nextInt();
			}
			 int maxElement = MaxAppear(arr);		        
		     System.out.println("Element with maximum appearance: " + maxElement);
	}
}
