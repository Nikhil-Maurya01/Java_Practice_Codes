import java.util.Scanner;

public class DayCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any day eg(mon,tue,wed,thu,fri,sat,sun) :");
        String day=sc.next();
        if(day.equals("sat") || day.equals("sun")){
            System.out.println("Day is a weekend");
        }
        else{
            System.out.println("Day is a working day");
        }
    }

}
