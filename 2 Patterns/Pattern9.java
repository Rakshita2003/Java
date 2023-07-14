// 1           Floyd's Triangle
// 2 3            row 1-value 1; row 2-value 2; row 3-value 3,....
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
