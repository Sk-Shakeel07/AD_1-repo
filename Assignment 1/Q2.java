package assignment1;
import java.util. *; 
public class Q2 {

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in); 
	        System.out.println("Enter the size of the array"); 
	        int n=obj.nextInt(); 
	        int[] arr=new int [n];   
	        System.out.println("enter the numbers in the array"); 
	        for (int i = 0; i <n; i++) 
	            arr[i]=obj.nextInt(); 
	        int max = Integer.MIN_VALUE; 
	        int min = Integer.MAX_VALUE; 
	        for (int i = 0; i < n; i++)  
	        { 
	            if (arr[i] > max) 
	                max = arr[i]; 
	            if (arr[i] < min) 
	                min = arr[i]; 
	        } 
	      
	        System.out.println("In the array Maximum value: " + max+"and Minimum value: " + min);    

	}

}
