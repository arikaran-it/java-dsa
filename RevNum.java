import  java.util.Scanner;

class RevNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();

        int temp;
        while(num!=0){
            temp=num%10;
            num=num/10;
            System.out.print(temp);
        }
    }
}