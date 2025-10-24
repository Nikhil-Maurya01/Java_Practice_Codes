public class MultipleTables {
    public static void main(String[] args) {
        // Display header
        System.out.println("These are numeric tables from 1 to 10:");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();

        // Print multiplication tables from 1 to 10 side by side
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                (1 * i) + "\t" +
                (2 * i) + "\t" +
                (3 * i) + "\t" +
                (4 * i) + "\t" +
                (5 * i) + "\t" +
                (6 * i) + "\t" +
                (7 * i) + "\t" +
                (8 * i) + "\t" +
                (9 * i) + "\t" +
                (10 * i)
            );
        }
    }
}
