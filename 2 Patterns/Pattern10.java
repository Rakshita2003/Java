// 1               0-1 Triangle
// 01          
// 101           even i+j=1; odd i+j=0  -->(1,1)=2 which is even;(2,1)=3 odd; (2,2)=4; (3,1)=4; ....
// 0101
// 10101

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                int sum = i + j;

                if (sum % 2 == 0) {
                    // even
                    System.out.print("1");
                } else {
                    // odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
