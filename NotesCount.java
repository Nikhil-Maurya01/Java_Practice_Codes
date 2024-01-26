import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount of money :");
        int amount=sc.nextInt();
        System.out.println("Enter range :");
        int range=sc.nextInt();
        switch (range){
            case 2000: int n1=amount/2000;
            System.out.println("Number of 2000 notes is "+n1);
            amount=amount%2000;
            case 500: int n2=amount/500;
            System.out.println("Number of 500 notes is "+n2);
            amount=amount%500;
            case 200: int n3=amount/200;
            System.out.println("Number of 200 notes is "+n3);
            amount=amount%200;
            case 100: int n4=amount/100;
            System.out.println("Number of 100 notes is "+n4);
            amount=amount%100;
            case 50: int n5=amount/50;
            System.out.println("Number of 50 notes is "+n5);
            amount=amount%50;
            case 20: int n6=amount/20;
            System.out.println("Number of 20 notes is "+n6);
            amount=amount%20;
            case 10: int n7=amount/10;
            System.out.println("Number of 10 notes is "+n7);
            amount=amount%10;
            case 5: int n8=amount/5;
            System.out.println("Number of 5 coins is "+n8);
            amount=amount%5;
            case 2: int n9=amount/2;
            System.out.println("Number of 2 coins is "+n9);
            amount=amount%2;
            case 1: int n10=amount/1;
            System.out.println("Number of 1 coins is "+n10);
            amount=amount%1;
            break;
            default: System.out.println("Invalid");
            break;
        }
    }
}
