import java.util.Scanner;

public class MultiplicationOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        int a = num;       // Store original number for display
        int rem = 0;       // To store each digit
        int product = 1;   // To store the product of digits

        // Loop to extract digits and multiply them
        while (num > 0) {
            rem = num % 10;        // Get last digit
            product = product * rem; // Multiply with current product
            num = num / 10;        // Remove last digit
        }

        // Display result
        System.out.println("Product of digits of " + a + " is = " + product);

        sc.close(); // Close the scanner to avoid resource leak
    }
}
