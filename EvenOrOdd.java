import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // Check if the number is even or odd using modulus operator
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
``
