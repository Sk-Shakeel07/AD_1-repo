package assignment6_AD;
import java.util.Scanner;
public class Q4 {
    public static void minPair(int[] arr) {
        int diff = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int value = Math.abs(arr[i] - arr[j]);
                if (diff > value) {
                    diff = value;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }
        System.out.println("The Min pair is " + first + " & " + second);
    }

    public static void maxPair(int[] arr) {
        int diff = Integer.MIN_VALUE;
        int first = 0;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int value = Math.abs(arr[i] - arr[j]);
                if (diff < value) {
                    diff = value;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }
        System.out.println("The Max pair is " + first + " & " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        minPair(arr);
        maxPair(arr);
    }
}
