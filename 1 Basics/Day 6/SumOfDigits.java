// compute the sum of digits in an integer

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sumOfDigits = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n = n / 10;
        }
        
        return sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The sum of this number is " + sumOfDigits(n));
    }
}
