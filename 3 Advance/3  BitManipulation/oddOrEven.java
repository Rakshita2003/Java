// check if a number is odd or even

public class oddOrEven {
    public static void oddOrEven(int n) {

        int bitMask = 1; // add 001

        if ((n & bitMask) == 0) {
            System.out.println("Even number"); // LSB IS 0
        } else {
            System.out.println("Odd number"); // LSB IS 1
        }

    }

    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(12);
    }
}
