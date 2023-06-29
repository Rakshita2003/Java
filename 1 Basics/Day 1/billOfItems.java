// enter the cost of 3 items using float and output the total cost to the user. also add 18% GST to the items in the bill

import java.util.Scanner;

public class billOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();
        System.out.println("Enter the cost of pen: ");
        float pen = sc.nextFloat();

        float totalcost = pen + pencil + eraser;
        System.out.println("The total cost is: " + totalcost);

        float withGST = totalcost + (0.18f * totalcost);
        System.out.println("The total cost with gst is: " + withGST);
    }

}