// print the pattern box //square
//  *****
//  *****
//  *****
//  *****

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4; // rows
        int m = 5; // cols

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
