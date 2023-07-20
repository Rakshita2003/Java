// check if a number is a power of 2 or not  
// eg: 4  -> 2^2

public class PowerOf2 {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
}
