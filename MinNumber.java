import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter 4 numbers
        System.out.println("Enter 4 numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        // Assume first number is the minimum
        int min = n1;

        // Compare with other numbers to find the smallest
        if (min > n2) {
            min = n2;
        }
        if (min > n3) {
            min = n3;
        }
        if (min > n4) {
            min = n4;
        }

        // Display the smallest number
        System.out.println("Smallest number is: " + min);

        sc.close(); // Close the scanner to avoid resource leak
    }
}
