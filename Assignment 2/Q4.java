package assignment2;
import java.util.*; 
public class Q4 {

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in); 
	        System.out.println("Enter the number"); 
	        int n=obj.nextInt(); 
	        int fact=1; 
	        while(n>0) 
	        { 
	            fact*=n; 
	            n--; 
	        } 
	        System.out.println("The factorial is "+fact);

	}

}
