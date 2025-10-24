public class RightAlignedInvertedTrianglePattern {
    public static void main(String[] args) {
        // Loop for each row starting from 4 down to 1
        for (int i = 4; i >= 1; i--) {

            // Print leading spaces to right-align the triangle
            for (int h = i + 1; h <= 4; h++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
