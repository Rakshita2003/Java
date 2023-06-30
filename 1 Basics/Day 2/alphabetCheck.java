public class alphabetCheck {
    public static void main(String[] args) {
      
        char ch = 'A';

        if (ch >= 'a' && ch <= 'z') {
            System.err.println(ch + " is Lowercase");
        } else {
            System.err.println(ch + " is Uppercase");
        }

        char c = '+';
         if ((c >= 'a' && c <= 'z' )|| (c >= 'A' && c <= 'Z')) {
            System.err.println(c + " is an alphabet");
        } else {
            System.err.println(c + " is not an alphabet");
        }
    }
}
