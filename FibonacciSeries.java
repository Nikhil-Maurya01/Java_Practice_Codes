import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the range (number of terms)
        System.out.println("Enter range:");
        int n = sc.nextInt();

        // Initialize first two Fibonacci numbers
        int f0 = 0;
        int f1 = 1;
        int f2;

        // Handle edge cases based on input
        if (n == 0) {
            System.out.println("Blank...");
        } else if (n == 1) {
            System.out.print("0");
        } else if (n == 2) {
            System.out.println("0\t1");
        } else if (n > 2) {
            // Print first two numbers
            System.out.print("0\t1");

            // Generate and print remaining Fibonacci numbers
            for (int i = 3; i <= n; i++) {
                f2 = f0 + f1;
                System.out.print("\t" + f2);
                f0 = f1;
                f1 = f2;
            }
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
