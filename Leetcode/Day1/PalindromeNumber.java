public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int palindrome = x;
       int reverse = 0;

       while (palindrome != 0) {
           int rem = palindrome % 10;
           reverse = reverse * 10 + rem;
           palindrome = palindrome / 10;
       }

       if(x<0){
           return false;
       }

       if (x == reverse) {
           return true;
       }

       return false;
   }
}
