package assignment2;
import java.util.*; 
public class Q1 {

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in); 
	        System.out.println("Enter the size of the array"); 
	        int n=obj.nextInt(); 
	        int[] arr=new int [n];      
	        System.out.println("enter the numbers in the array"); 
	        for (int i = 0; i <n; i++) 
	            arr[i]=obj.nextInt(); 
	        int maxSum = Integer.MIN_VALUE; 
	        int currSum = arr[0]; 
	        for (int i = 0; i <= n - 1; i++)  
	        { 
	            currSum=Math.max(arr[i], currSum+arr[i]); 
	            if (currSum > maxSum) 
	                maxSum = currSum;     
	        } 
	        System.out.println("The maximum sum is "+maxSum);   

	}

}
