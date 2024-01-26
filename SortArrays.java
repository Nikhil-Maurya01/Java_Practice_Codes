import java.util.Arrays;
import java.util.Scanner;
public class SortArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:");
		int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}
