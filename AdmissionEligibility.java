import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.println("Enter marks of three papers:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        // Input gender
        System.out.println("Enter gender (m/f):");
        char gen = sc.next().charAt(0);

        // Calculate total and average
        int total = m1 + m2 + m3;
        System.out.println("Total marks = " + total);

        int percentage = total / 3;
        System.out.println("Average Percentage = " + percentage);

        // Check eligibility: minimum 62% and female
        if (percentage >= 62 && gen == 'f') {
            System.out.println("Eligible for admission!");
        } else {
            System.out.println("Not eligible for admission.");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
