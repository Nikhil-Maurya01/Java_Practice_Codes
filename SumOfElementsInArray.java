public class SumOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the length of the array
        System.out.println("Enter length of array :");
        int n = sc.nextInt(); // Read the array size

        int arr[] = new int[n]; // Declare an integer array of size 'n'
        int sum = 0; // Initialize sum to 0

        // Prompt user to input elements of the array
        System.out.println("Input elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element and store in array
            sum = sum + arr[i];    // Add element to sum
        }

        // Display the sum of array elements
        System.out.println("Sum of elements of array is = " + sum);

        sc.close(); // Close the scanner to avoid resource leak
    }
}
