import java.util.Scanner;
public class InputElementsIn2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows of array:");
		int r=sc.nextInt();
        System.out.println("Enter columns of array");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Input elements of array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array is :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

