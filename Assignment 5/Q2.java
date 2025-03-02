package assignment6_AD;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Duplicated elements are: ");
        boolean[] printed = new boolean[n]; 

        for (int i = 0; i < arr.length; i++) {
            if (printed[i]) {
                continue; 
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    printed[i] = true; 
                    break;
                }
            }
        }
    }
}
