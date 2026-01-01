class RevArr{
    public  static void main(String args[]){
        int[] arr={1,3,8,5,4,6,9};
        int[] new_arr=new int[arr.length];
        int temp;
        for(int i=arr.length-1;i>=0;i++){
            temp=arr[i];
            System.out.println("new Reverse Array: " +temp);
            }
        }
    }