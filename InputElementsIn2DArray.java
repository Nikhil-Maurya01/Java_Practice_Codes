import java.util.Scanner;

public class InputElementsIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter number of rows
        System.out.println("Enter rows of array:");
        int r = sc.nextInt();

        // Prompt user to enter number of columns
        System.out.println("Enter columns of array:");
        int c = sc.nextInt();

        // Declare and initialize 2D array
        int arr[][] = new int[r][c];

        // Input elements into the 2D array
        System.out.println("Input elements of array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display the 2D array
        System.out.println("Array is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // Move to next row
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
