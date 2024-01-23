import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of three papers :");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        System.out.println("Enter gender :");
        char gen=sc.next().charAt(0);
        int total=(m1+m2+m3);
        System.out.println("Total marks = "+total);
        int percentage=(total/3);
        System.out.println("Average Percentage = "+percentage);
        if(percentage>=62 && gen=='f'){
            System.out.println("Eligible for admission!");
        }
        else{
            System.out.println("Not eligible for admission :(");
        }
    }

}
