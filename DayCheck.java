import java.util.Scanner;

public class DayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a day abbreviation
        System.out.println("Enter any day (e.g., mon, tue, wed, thu, fri, sat, sun):");
        String day = sc.next();

        // Check if the entered day is a weekend
        if (day.equals("sat") || day.equals("sun")) {
            System.out.println("Day is a weekend!");
        } else {
            // Otherwise, it's a working day
            System.out.println("Day is a weekday :(");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
