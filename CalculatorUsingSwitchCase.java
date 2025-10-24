import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Infinite loop to keep calculator running until user exits
        while (true) {
            // Display menu options
            System.out.println("Select any arithmetic operation from below:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Remainder\n6. Exit");

            int opt = sc.nextInt(); // User selects operation

            // Switch-case to handle selected operation
            switch (opt) {
                case 1:
                    // Addition
                    System.out.println("Enter two numbers:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int sum = a + b;
                    System.out.println("Sum = " + sum);
                    break;

                case 2:
                    // Subtraction
                    System.out.println("Enter two numbers:");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    int diff = c - d;
                    System.out.println("Difference = " + diff);
                    break;

                case 3:
                    // Multiplication
                    System.out.println("Enter two numbers:");
                    int e = sc.nextInt();
                    int f = sc.nextInt();
                    int mult = e * f;
                    System.out.println("Product = " + mult);
                    break;

                case 4:
                    // Division
                    System.out.println("Enter two numbers:");
                    double g = sc.nextDouble();
                    double h = sc.nextDouble();
                    if (h != 0) {
                        double div = g / h;
                        System.out.println("Division = " + div);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    // Remainder
                    System.out.println("Enter two numbers:");
                    int i = sc.nextInt();
                    int j = sc.nextInt();
                    if (j != 0) {
                        int rem = i % j;
                        System.out.println("Remainder = " + rem);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting calculator...");
                    sc.close(); // Close scanner before exiting
                    System.exit(0);
                    break;

                default:
                    // Invalid option
                    System.out.println("Invalid input! Please select a valid option.");
                    break;
            }
        }
    }
}
