import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        int savenum = num; // Store original number for final comparison
        int rem = 0;        // To store remainder (digit)
        int rev = 0;        // To store reversed number

        // Reverse the number
        while (num > 0) {
            rem = num % 10;         // Get last digit
            rev = rev * 10 + rem;   // Append digit to reversed number
            num = num / 10;         // Remove last digit
        }

        // Check if original and reversed numbers are equal
        if (savenum == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
