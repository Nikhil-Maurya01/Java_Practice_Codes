import java.util.Scanner;
public class SumOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Input elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of elements of array is = "+sum);
    }
}
