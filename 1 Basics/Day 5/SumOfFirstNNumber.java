//print the sum of first n natural numbers

public class SumOfFirstNNumber {
    public static void main(String[] args) {
        int n = 12;

        int sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum + i;
        }
         System.out.println("The sum of n natural numbers is " + sum);
    }
}
