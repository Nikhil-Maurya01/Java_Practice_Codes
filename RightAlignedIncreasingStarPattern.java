public class RightAlignedIncreasingStarPattern {
    public static void main(String[] args) {
        // Outer loop controls the number of rows (1 to 4)
        for (int i = 1; i <= 4; i++) {
            // Print spaces to right-align the stars
            for (int k = 4; k >= i + 1; k--) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
