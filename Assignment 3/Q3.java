package assignment3;
import java.util.Scanner;
public class Q3 {
	 public static int Fact(int x) 
	    { 
	        if(x == 0)  
	            return 1;  
	           
	        return x*Fact(x-1); 
	    }

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in); 
	        System.out.println("Enter the number"); 
	        int n=obj.nextInt(); 
	        System.out.println("The factorial is : "+Fact(n));   

	}

}
