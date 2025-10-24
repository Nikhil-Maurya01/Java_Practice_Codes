import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a year
        System.out.println("Enter Year:");
        int year = sc.nextInt();

        // Check leap year conditions
        // Rule: A year is a leap year if it is divisible by 4 but not by 100,
        // unless it is also divisible by 400
        if (year % 100 != 0) {
            if (year % 4 == 0) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            if (year % 400 == 0) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
