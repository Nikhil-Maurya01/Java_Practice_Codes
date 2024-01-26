import java.util.Scanner;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter size of array :");
        int r=sc.nextInt();
        String arr[]=new String[r];
        System.out.println("Enter elements of array :");
        for(int i=0;i<r;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i].equals(arr[j])) && i!=j){
                    System.out.println("duplicate element is "+"'"+arr[j]+"'");
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("No duplicate elements!");
        }
    }
}
