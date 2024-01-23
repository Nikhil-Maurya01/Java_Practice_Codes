import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character :");
        int ch=sc.next().charAt(0);
        char i=(char)ch;
        if(ch>=65 && ch<=90){
            System.out.println(i+" Is an uppercase letter");
        }
        else if(ch>=97 && ch<=122){
            System.out.println(i+" Is a lowercase letter");
        }
        else if(ch>=48 && ch<=57){
            System.out.println(i+" Is a digit ");
        }
        else{
            System.out.println(i+" Is Character is a symbol");
        }
    }
}
