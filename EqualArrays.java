import java.util.Arrays;
import java.util.Scanner;
public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of arrays :");
        int r=sc.nextInt();
        int arr1[]=new int[r];
        int arr2[]=new int[r];
        System.out.println("Enter elements of array 1");
        for(int i=0;i<r;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of array 2");
        for(int i=0;i<r;i++){
            arr2[i]=sc.nextInt();
        }
        if(Arrays.equals(arr1,arr2)==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
