// print Nth fibonacci number --->T.c is O(2^n)

public class Problem5 {

    public static int fibo(int n) {
        // base class
        if (n == 0 | n == 1) {
            return n;
        }

        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        int fn = fnm1 + fnm2;

        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
}
