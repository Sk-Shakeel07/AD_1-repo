package assignment3;
import java.util.*; 
public class Q7 {
	 public static int findGCD(int x,int y) 
	    { 
	        if(y==0) 
	            return x; 
	        return (findGCD(y, x%y)); 
	    } 

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in); 
	        System.out.println("Enter two number"); 
	        int a=obj.nextInt(); 
	        int b=obj.nextInt(); 
	        System.out.println("The GCD of "+a+" and "+b+" is : "+findGCD(a,b));  

	}

}
