// print factorial of a number -----> T.C = O(n)

public class Problem3 {

    public static int fac(int n) {
        // base class
        if (n == 0) {
            return 1;
        }
   
        int fn = n * fac(n - 1);

        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fac(n));
    }
}
