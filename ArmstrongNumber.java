import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        // Save original number for final comparison
        int savenum = num;
        int savenum2 = num;

        int rem = 0;       // To store remainder (digit)
        double sum = 0;    // To store sum of digits raised to power of total digits
        int dig = 0;       // To count number of digits

        // Count number of digits in the number
        while (num > 0) {
            num = num / 10;
            dig++;
        }

        // Calculate sum of digits raised to the power of total digits
        while (savenum > 0) {
            rem = savenum % 10;
            sum = sum + Math.pow(rem, dig);
            savenum = savenum / 10;
        }

        // Check if the original number is equal to the calculated sum
        if (savenum2 == sum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
