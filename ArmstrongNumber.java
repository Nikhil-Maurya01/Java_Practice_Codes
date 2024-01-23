import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int num=sc.nextInt();
        int savenum=num;
        int savenum2=num;
        int rem=0;
        double sum=0;
        int dig=0;
        while(num>0){
            num=num/10;
            dig++;
        }
        while(savenum>0){
            rem=savenum%10;
            sum=sum+(Math.pow(rem,dig));
            savenum=savenum/10;
        }
        if(savenum2==sum){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
