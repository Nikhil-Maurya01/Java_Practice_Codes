import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();
        int savenum=num;
        int rem=0;
        int rev=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(savenum==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
