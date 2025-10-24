import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the length of both arrays
        System.out.println("Enter length of arrays:");
        int r = sc.nextInt();

        // Declare and initialize two arrays of the same length
        int arr1[] = new int[r];
        int arr2[] = new int[r];

        // Input elements for the first array
        System.out.println("Enter elements of array 1:");
        for (int i = 0; i < r; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input elements for the second array
        System.out.println("Enter elements of array 2:");
        for (int i = 0; i < r; i++) {
            arr2[i] = sc.nextInt();
        }

        // Compare both arrays using Arrays.equals() method
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
