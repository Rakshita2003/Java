//  1 1 1 1       Inverted Half Pyramid
//   2 2 2
//    3 3
//     4

public class Pattern20 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
