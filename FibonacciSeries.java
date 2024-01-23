import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range :");
        int n=sc.nextInt();
        int f0=0;
        int f1=1;
        int f2;
        if(n==0){
            System.out.println("Blank...");
        }
        else if(n==1){
            System.out.print("0");
        }
        else if(n==2){
            System.out.println("0\t1");
        }
        else if(n>2){
            System.out.print("0\t1");
            for(int i=3;i<=n;i++){
                f2=f0+f1;
                System.out.print("\t"+f2);
                f0=f1;
                f1=f2;
            }
        }
    }
}
