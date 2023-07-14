// ****        // Inverted Half Pyramid
// ***       4-1+1=4stars, 4-2+1=3 stars....
// **
// *

public class Pattern4 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // or

        // for (int i=n;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }
}
