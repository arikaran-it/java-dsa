import java.util.Scanner;

class ArrayMaxMin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

        sc.close();
    }
}