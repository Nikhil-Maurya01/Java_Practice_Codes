import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a character
        System.out.println("Enter any character:");
        int ch = sc.next().charAt(0); // Read character and convert to ASCII value
        char i = (char) ch;           // Convert ASCII back to character for display

        // Check if character is uppercase (ASCII range 65–90)
        if (ch >= 65 && ch <= 90) {
            System.out.println(i + " is an uppercase letter");
        }
        // Check if character is lowercase (ASCII range 97–122)
        else if (ch >= 97 && ch <= 122) {
            System.out.println(i + " is a lowercase letter");
        }
        // Check if character is a digit (ASCII range 48–57)
        else if (ch >= 48 && ch <= 57) {
            System.out.println(i + " is a digit");
        }
        // If none of the above, it's a symbol
        else {
            System.out.println(i + " is a symbol");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
