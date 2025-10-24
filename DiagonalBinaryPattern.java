public class DiagonalBinaryPattern {
    public static void main(String[] args) {
        // Loop through rows
        for (int i = 1; i <= 4; i++) {

            // Loop through columns
            for (int j = 1; j <= 4; j++) {

                // Print 1 if row index equals column index, else print 0
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
