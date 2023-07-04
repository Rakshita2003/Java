// a number is palindrome if the no. is equal to the reverse of a number, eg:121, the reverse is 121 itself

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0) {
            int rem = palindrome % 10;
            reverse = reverse * 10 + rem;
            palindrome = palindrome / 10;
        }

        if (n == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int palindrome = 2372;

        if (isPalindrome(palindrome)) {
            System.out.println(palindrome + " is Palindrome");
        } else {
            System.out.println(palindrome + " is not Palindrome");
        }
    }
}
