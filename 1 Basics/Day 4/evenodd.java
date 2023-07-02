// WAP that reads a set of integers & then prints the sum of the even & odd integers

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.print("Enter the number: ");
              number = sc.nextInt(); // input

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();

        } while (choice == 1);
        System.out.println("sum of even numbers: " + evensum);
        System.out.println("sum of odd numbers: " + oddsum);
    }
}
