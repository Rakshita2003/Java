// Print F.S of n terms
// In F.S , a number is the sum of the previous 2 numbers that came before it

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; //input

        int a = 0, b = 1;
        System.out.print(a + " ");

        if (n > 1) { // find nth term
            for (int i = 2; i <= n; i++) {

                System.out.print(b + " ");

                //swapping
                int temp = b;
                b = a + b;
                a = temp;

            }
            System.out.println();
        }

    }
}
