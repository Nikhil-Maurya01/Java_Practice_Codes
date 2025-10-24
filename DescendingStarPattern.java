public class DescendingStarPattern {
    public static void main(String[] args) {
        // Outer loop controls the number of rows (starts from 4 down to 1)
        for (int i = 4; i >= 1; i--) {
            // Inner loop prints '*' i times in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars in a row
            System.out.println();
        }
    }
}
