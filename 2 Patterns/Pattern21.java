// A           Character Pattern
// BC
// DEF
// GHIJ

public class Pattern21 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
