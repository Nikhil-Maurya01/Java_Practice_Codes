public class CenteredPyramidPattern {
    public static void main(String[] args) {
        // Loop for each row
        for (int i = 1; i <= 4; i++) {

            // Print leading spaces to center the pyramid
            for (int k = 4; k >= i + 1; k--) {
                System.out.print(" ");
            }

            // Print left side of pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print right side of pyramid (excluding middle star)
            for (int g = 2; g <= i; g++) {
                System.out.print("*");
            }

            // Optional trailing spaces (can be removed)
            for (int h = 1; h <= i + 1; h++) {
                System.out.print(" ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
