public class BinomialCoefficient {
    public static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        
        return fact;
    }

    public static int binCoeff(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);

        int binCoeff = a / (b * c);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}
