// set ith bit  --> CONVERT IT TO 1

public class Set {

    public static int setithbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setithbit(10, 2));
    }
}