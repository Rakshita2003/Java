// print sum of first n natural numbers   -----> T.C = O(n)

public class Problem4 {

    public static int calSum(int n) {
        // base class
        if (n == 1) {
            return 1;
        }

        int Sn = n + calSum(n - 1);

        return Sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calSum(n));
    }
}
