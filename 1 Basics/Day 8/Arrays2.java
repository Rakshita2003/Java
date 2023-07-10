//take an array as input from the user. search for a given number x and print the index at which it occurs

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.print("Enter the array:");

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // enter the key to be found in an array
        System.out.print("Enter the key: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.print("x found at index: " + i);
            }
        }
    }
}
