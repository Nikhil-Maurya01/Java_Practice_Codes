public class FindDuplicateInArray {
    public static void main(String[] args) {
        int count=0;
        String arr[]={"Nik","Anu","Sud","Sha"};
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
