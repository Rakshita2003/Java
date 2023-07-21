// print numbers from 1 to n  -- increasing order

public class Problem2 {

    public static void printIncre(int n) {
        // base class
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printIncre(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printIncre(n);
    }
}
