// calculate the greatest common divisor of 2 numbers 

public class GreatestCommonDiv {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 8;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD of n1 and n2 is " + n2);
    }
}


// Factors of 12: 1, 2, 3, 4, 6, 12

// Factors of 8: 1, 2, 4, 8

// Common Factors: 1, 2, 4

// Greatest Common Factor: 4