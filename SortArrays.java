import java.util.Arrays;
import java.util.Scanner;

public class SortArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the length of the array
        System.out.println("Enter length of array:");
        int n = sc.nextInt(); // Read the array size

        int arr[] = new int[n]; // Declare an integer array of size 'n'

        // Prompt user to enter elements of the array
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element and store in array
        }

        Arrays.sort(arr); // Sort the array in ascending order

        // Display the sorted array
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr)); // Print array using Arrays.toString()

        sc.close(); // Close the scanner to avoid resource leak
    }
}
