public class SumOfEvenAndOddUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the length of the array
        System.out.println("Enter length of array :");
        int n = sc.nextInt(); // Read the array size
        int arr[] = new int[n]; // Declare an integer array of size 'n'
        int evennum = 0; // Initialize sum of even numbers
        int oddnum = 0;  // Initialize sum of odd numbers

        // Prompt user to input elements of the array
        System.out.println("Input elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element and store in array

            // Check if element is even or odd and add to respective sum
            if (arr[i] % 2 == 0) {
                evennum = evennum + arr[i]; // Add even number to evennum
            } else {
                oddnum = oddnum + arr[i];   // Add odd number to oddnum
            }
        }

        // Display the sum of even and odd numbers
        System.out.println("Sum of even numbers = " + evennum);
        System.out.println("Sum of odd numbers = " + oddnum);

        sc.close(); // Close the scanner to avoid resource leak
    }
}
