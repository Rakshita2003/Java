//      *     // Inverted HALF pyramid or rotated by 180 degree
//     **        3 spaces 1 star = n-i=4-1=3 spaces
//    *** 
//   ****

public class Pattern5 {
    public static void main(String[] args) {
        int n = 4;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop -> star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
