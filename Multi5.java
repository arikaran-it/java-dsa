class Multi5{
    public static void main(String[] args){
        int target=5;
        int[] table=new int[11];
        for(int i=1;i<=10;i++){
            table[i]=target*i;
            System.out.println(table[i]);
        }
    }
}
