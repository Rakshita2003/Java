// email = "rakshitagowda22@gmail.com"
// username = "rakshitagowda22"

import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String email = sc.next();
        String username = " ";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
              break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.print(username);
    }
    
}
