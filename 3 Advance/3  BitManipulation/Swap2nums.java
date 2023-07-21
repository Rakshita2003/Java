// swap 2 numbers without using any 3rd variable

public class Swap2nums {
    public static void main(String[] args) {
        int x = 3, y = 4;

        System.out.println("Before swapping: x = " + x + " and y = " + y);
        // swap using xor

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swapping: x = " + x + " and y = " + y);
    }
}
