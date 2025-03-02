package assignment4;
import java.util.*;
public class Q5 {
	public static void display(int arr[]) {
	    System.out.print("Array elements: ");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + ", ");
	    }
	    System.out.println();
	}
    public static void mergSortedArray(int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] > B[j]) {
                    A[i] = A[i] - B[j];
                    B[j] = A[i] + B[j];
                    A[i] = B[j] - A[i];
                }
            }
        }
        Arrays.sort(B);
    }
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of A");
	        int a = sc.nextInt();
	        int[] A = new int[a];
	        System.out.println("Enter the Elements of the array A");
	        for (int i = 0; i < a; i++) {
	            A[i] = sc.nextInt();
	        }

	        System.out.println("Enter the size of B");
	        int b = sc.nextInt();
	        int[] B = new int[b];
	        System.out.println("Enter the Elements of the array B");
	        for (int i = 0; i < b; i++) {
	            B[i] = sc.nextInt();
	        }

	        System.out.println("Arrays before merging");
	        System.out.println("A= ");
	        display(A);
	        System.out.println("B= ");
	        display(B);

	        mergSortedArray(A, B);

	        System.out.println("Arrays after merging");
	        System.out.println("A= ");
	        display(A);
	        System.out.println("B= ");
	        display(B);
		

	}

}
