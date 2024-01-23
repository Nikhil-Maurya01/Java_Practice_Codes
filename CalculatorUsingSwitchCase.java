import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
        System.out.println("Select any arithmetic operation from below :\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Remainder\n6.Exit");
        int opt=sc.nextInt();
        switch (opt){
            case 1:System.out.println("Enter two numbers :");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            System.out.println("Sum = "+sum);
            break;
            case 2:System.out.println("Enter two numbers :");
            int c=sc.nextInt();
            int d=sc.nextInt();
            int diff=c-d;
            System.out.println("Difference = "+diff);
            break;
            case 3:System.out.println("Enter two numbers :");
            int e=sc.nextInt();
            int f=sc.nextInt();
            int mult=e*f;
            System.out.println("Product = "+mult);
            break;
            case 4:System.out.println("Enter two numbers :");
            Double g=sc.nextDouble();
            Double h=sc.nextDouble();
            Double div=g/h;
            System.out.println("Division = "+div);
            break;
            case 5:System.out.println("Enter two numbers :");
            int i=sc.nextInt();
            int j=sc.nextInt();
            int rem=i%j;
            System.out.println("Remainder = "+rem);
            break;
            case 6: System.exit(0);
            break;
            default: System.out.println("Invalid input!!!");
            break;
        }
    }
    }
}
