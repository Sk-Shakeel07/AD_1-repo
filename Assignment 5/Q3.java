package assignment6_AD;
import java.util.*;
public class Q3 {
	public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
	public static int missed(int[]arr,int size) {
		bubbleSort(arr);
		for(int i = 0;i<size;i++){
			if(arr[i] != i+1) {
				return i +1;
			}
		}
		return size;
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
		System.out.println("The missing no. is "+missed(arr,arr.length));
	}
}
