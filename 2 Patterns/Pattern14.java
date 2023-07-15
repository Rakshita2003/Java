// Buttefly Pattern

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;

        // first half-upper part
        for (int i = 1; i <= n; i++) {
            // 1st part---star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part--star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half is the mirror image of the upper part
        for (int i = n; i >= 1; i--) {

            // 1st part---star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part--star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
