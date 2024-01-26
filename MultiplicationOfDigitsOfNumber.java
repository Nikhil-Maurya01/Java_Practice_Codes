import java.util.Scanner;

public class MultiplicationOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();
        int a=num;
        int rem=0;
        int sum=1;
        while(num>0){
            rem=num%10;
            sum=sum*rem;
            num=num/10;
        }
        System.out.println("Sum of digits of "+a+" is = "+sum);
    }
}
