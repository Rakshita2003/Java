// take an array of names as input from the user and print them on the screen

import java.util.*;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        String names[] = new String[size];
        System.out.print("Enter the array: ");

        // input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.print(names[i] +" " );
        }
    }
}
