public class reverseInt {

    // reverse an integer

    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            rev = (rev * 10) + lastDigit;
            x = x / 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        if (x < 0) {
            return -1 * rev;
        }

        return rev;
    }
}
