import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();
        int a=num;
        int i=0;
        while(num>0){
            num=num/10;
            ++i;
        }
        System.out.println("Number of digits in "+a+" is "+i);
    }
}
