import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter 5 numbers
        System.out.println("Enter 5 numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        // Assume first number is the maximum
        int max = n1;

        // Compare with other numbers to find the maximum
        if (max < n2) {
            max = n2;
        }
        if (max < n3) {
            max = n3;
        }
        if (max < n4) {
            max = n4;
        }
        if (max < n5) {
            max = n5;
        }

        // Display the largest number
        System.out.println("Biggest number is: " + max);

        sc.close(); // Close the scanner to avoid resource leak
    }
}
