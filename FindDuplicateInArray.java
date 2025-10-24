import java.util.Scanner;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // Prompt user to enter the size of the array
        System.out.println("Enter size of array:");
        int r = sc.nextInt();

        // Declare and initialize the array
        String arr[] = new String[r];

        // Input elements of the array
        System.out.println("Enter elements of array:");
        for (int i = 0; i < r; i++) {
            arr[i] = sc.next();
        }

        // Check for duplicate elements using nested loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (            }
        }

        // If no duplicates found
        if (count == 0) {
            System.out.println("No duplicate elements!");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
