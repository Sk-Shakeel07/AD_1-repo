package assignment3;
import java.util.*; 
public class Q4 {
	 public static int Fibo(int x) 
	    { 
	        if(x == 0)  
	            return 0; 
	        if(x == 1)  
	            return 1;  
	           
	        return Fibo(x-1)+Fibo(x-2); 
	    }

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in); 
        System.out.println("Enter the n"); 
        int n=obj.nextInt(); 
        System.out.println("The nth fibbonacci number is : "             
+Fibo(n));  

	}

}
