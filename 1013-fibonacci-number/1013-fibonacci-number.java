class Solution {
    public static int fib(int n) {
        if (n==0)  return 0;
        if (n==1) return 1;

        int a = 0,b = 1;
        for(int i = 2;i <= n;i++){
            int temp = a+b;
            a = b;
            b = temp;
        }
        return b;
    } 
    public static void main(String[] args){
        int n = 2;
        System.out.println("F(" + n + ") = " + fib(n)); 
    }
}