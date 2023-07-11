// take an array of strings input from the user & find the cumulative/combined length of all those strings

import java.util.*;

public class Strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String array[] = new String[size];
        int totLength = 0;

        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.print(totLength);
    }
}
