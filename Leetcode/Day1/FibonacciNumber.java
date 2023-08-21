public class FibonacciNumber {
    // the sum of the two preceeding numbers
    
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }

        int fn1= fib(n-1);
        int fn2= fib(n-2);
        int nth = fn1+fn2;
        return nth;
   }
}
