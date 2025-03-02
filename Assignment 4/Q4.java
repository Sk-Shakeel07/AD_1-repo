package assignment4;
import java.util.*;
public class Q4 {
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
    public static int arrayReduction(int[] a) {
        bubbleSort(a);
        int count = 0;
        int min = a[0];       
        if (a[a.length - 1] == 0) {
            return 0;
        } else {
            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] - min;
                
                if (a[i] == 0) {
                    min = a[i]; 
                }
                                
                if (a[i] != 0) {
                    count++;
                }
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();       
        }
        System.out.println("The count of reducing array is = " + arrayReduction(array));
    }
}
