import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the amount
        System.out.println("Enter amount of money:");
        int amount = sc.nextInt();

        // Prompt user to enter starting denomination
        System.out.println("Enter starting denomination (e.g., 2000, 500, 100):");
        int range = sc.nextInt();

        // Switch-case to calculate note/coin count starting from selected denomination
        switch (range) {
            case 2000:
                int n1 = amount / 2000;
                System.out.println("Number of 2000 notes: " + n1);
                amount %= 2000;
            case 500:
                int n2 = amount / 500;
                System.out.println("Number of 500 notes: " + n2);
                amount %= 500;
            case 200:
                int n3 = amount / 200;
                System.out.println("Number of 200 notes: " + n3);
                amount %= 200;
            case 100:
                int n4 = amount / 100;
                System.out.println("Number of 100 notes: " + n4);
                amount %= 100;
            case 50:
                int n5 = amount / 50;
                System.out.println("Number of 50 notes: " + n5);
                amount %= 50;
            case 20:
                int n6 = amount / 20;
                System.out.println("Number of 20 notes: " + n6);
                amount %= 20;
            case 10:
                int n7 = amount / 10;
                System.out.println("Number of 10 notes: " + n7);
                amount %= 10;
            case 5:
                int n8 = amount / 5;
                System.out.println("Number of 5 coins: " + n8);
                amount %= 5;
            case 2:
                int n9 = amount / 2;
                System.out.println("Number of 2 coins: " + n9);
                amount %= 2;
            case 1:
                int n10 = amount / 1;
                System.out.println("Number of 1 coins: " + n10);
                amount %= 1;
                break;
            default:
                System.out.println("Invalid denomination entered.");
                break;
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
