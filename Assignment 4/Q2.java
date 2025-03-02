package assignment4;
import java.util.*;
public class Q2 {
	public static void selectionSort(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int min = A[i];
            int minj = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < min) {
                    minj = j;
                    min = A[j];
                }
            }           
            if (minj != i) {
                A[minj] = A[i];
                A[i] = min;
            }
        }
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
		System.out.print("Before sorting, array elements are: ");
		for(int i = 0;i<n;i++){
		System.out.print(arr[i]+" ");
		}
	    selectionSort(arr);
		System.out.print("\nAfter sorting, array elements are: ");
		for(int i = 0;i<n;i++){
		System.out.print(arr[i]+" ");
		}
	}
}

