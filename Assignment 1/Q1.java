package assignment1;
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
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += arr[i];        
        System.out.println("The sum of the numbers is: "+ sum); 

	}

}
