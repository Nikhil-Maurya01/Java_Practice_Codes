import java.util.Scanner;

public class EvenAndOddNumbersCountingUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the length of the array
        System.out.println("Enter length of array:");
        int n = sc.nextInt();

        // Declare and initialize the array
        int arr[] = new int[n];

        // Counters for even and odd numbers
        int evennum = 0;
        int oddnum = 0;

        // Input elements and count even/odd numbers
        System.out.println("Input elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            // Check if the number is even or odd
            if (arr[i] % 2 == 0) {
                evennum++;
            } else {
                oddnum++;
            }
        }

        // Display the results
        System.out.println("Number of even numbers = " + evennum);
        System.out.println("Number of odd numbers = " + oddnum);

        sc.close(); // Close the scanner to avoid resource leak
    }
}
