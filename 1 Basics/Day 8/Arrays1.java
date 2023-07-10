// take an array as input from the user and print it as an output

import java.util.Scanner;

public class Arrays1 {
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

        // output
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}