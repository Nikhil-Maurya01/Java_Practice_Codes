public class PrintElementOfArrayUsingToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the length of the array
        System.out.println("Enter length of array:");
        int n = sc.nextInt(); // Read the array size

        int arr[] = new int[n]; // Declare an integer array of size 'n'

        // Prompt user to enter elements of the array
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element and store in array
        }

        // Print the array using Arrays.toString() method
        System.out.println(Arrays.toString(arr));

        sc.close(); // Close the scanner to avoid resource leak
    }
}
