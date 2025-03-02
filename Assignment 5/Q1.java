package assignment6_AD;
import java.util.*;

public class Q1 {
    public static int findFirstRepeated(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                } 
            }
        }
        return -1;  
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the " + n + " array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = findFirstRepeated(arr);
        if (result != -1) {
            System.out.println("First repeated element is " + result);
        } else {
            System.out.println("No repeated element found.");
        }    
    }
}
 