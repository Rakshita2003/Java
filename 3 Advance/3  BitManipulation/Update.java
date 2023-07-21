// Update ith bit 

public class Update {

    public static int update(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearithbit(n, i);
        } else {
            return setithbit(n, i);
        }
    }

    public static int clearithbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setithbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(update(10, 2, 1));
    }
}
