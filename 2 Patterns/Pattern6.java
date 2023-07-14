// 1           Half Pyramid with numbers
// 12            i=1, 1 to 1 ;i=2, 1 to 2
// 123
// 1234
// 12345

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5; // rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
