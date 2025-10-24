public class LeftAlignedTrianglePattern {
    public static void main(String[] args) {
        // Loop for each row
        for (int i = 1; i <= 4; i++) {

            // Print asterisks equal to the row number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
