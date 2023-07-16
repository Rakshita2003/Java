// print hollow diamond pattern

public class Pattern22 {
    public static void main(String[] args) {
        int n = 5;

        // prints upper section of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                //  space
                System.out.print(" ");
            }
            //  star
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {
                //  space
                System.out.print(" ");
            }
            if (i == 1) {
                // throws cursor to the next line
                System.out.print(" ");
            } else {
                // prints star and throws cursor to the next line
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // prints lower section of the pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                // space
                System.out.print(" ");
            }
            // star
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {
                //  space
                System.out.print(" ");
            }
            if (i == 1) {
                // throws cursor to the next line
                System.out.print(" ");
            } else {
                // prints star and throws cursor to the next line
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
