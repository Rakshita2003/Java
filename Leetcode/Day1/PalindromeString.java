public class PalindromeString {

    // two-pointer approach-- where two pointers are maintained, one at the start of
    // the string and the other at the end of the string. The two pointers move
    // towards each other until they meet in the middle of the string.

    public boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;

        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirst)) { // punctuation or space or anything
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) { // convert to lowercase to check
                    return false;
                }
                start++;
                last--;
            }
        }

        return true;
    }

}
