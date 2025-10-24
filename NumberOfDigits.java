import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        int a = num; // Store original number for display
        int i = 0;   // Counter for number of digits

        // Loop to count digits by dividing the number by 10 repeatedly
        while (num > 0) {
            num = num / 10;
            ++i;
        }

        // Display the result
        System.out.println("Number of digits in " + a + " is " + i);

        sc.close(); // Close the scanner to avoid resource leak
    }
}
