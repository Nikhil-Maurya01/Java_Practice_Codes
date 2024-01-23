import java.util.Scanner;
public class SumOfEvenAndOddUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n=sc.nextInt();
        int arr[]=new int[n];
        int evennum=0;
        int oddnum=0;
        System.out.println("Input elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                evennum=evennum+arr[i];
            }
            else{
                oddnum=oddnum+arr[i];
            }
        }
        System.out.println("Sum of even numbers = "+evennum);
        System.out.println("Sum of odd numbers = "+oddnum);
    }
}
