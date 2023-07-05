// print the sum of odd numbers from 1 to n

public class SumOfOdd {

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        System.out.print("Odd numbers: ");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum = sum + i;
               
            }
           
        }
        System.out.println();
        System.out.print("Sum of Odd numbers is ");
        System.out.print(sum + " ");
    }
}
