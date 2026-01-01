class BigOf3 {
    public static void main(String args[]) {
        int a = 14;
        int b = 24;
        int c = 34;
        if (a >= b && a >= c) {
            System.out.println("Greatest: a");
        } else if (b >= a && b >= c) {
            System.out.println("Greatest: b");
        } else {
            System.out.println("Greatest: c");
        }
    }
}
