import java.util.Scanner;
public class EvenAndOddNumbersCountingUsingArray {
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
                evennum++;
            }
            else{
                oddnum++;
            }
        }
        System.out.println("Number of even numbers = "+evennum);
        System.out.println("Number of odd numbers = "+oddnum);
    }
}
