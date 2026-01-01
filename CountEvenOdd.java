class CountEvenOdd{
    public  static void main(String args[]){
        int[] arr={1,3,8,5,4,6,9};
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even Count: "+evenCount+" Odd Count: "+oddCount);
    }
}