// take a matrix as input from the user. search for a given number X & print the indices at which it occurs. 
// indices means rows/colums(i,j)

import java.util.*;

public class TwoDArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the key: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.print("X found at locations ("+i+","+j+")");
                }
            }
        }
    }
}


//output to be entered example:
// 3
// 3
// 1234   43211  1234
// key is 11