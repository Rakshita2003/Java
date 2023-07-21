// print numbers from n to 1 -- decreasing order

public class Problem1 {

    public static void printDecre(int n) {
        // base class
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        printDecre(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDecre(n);

    }
}
