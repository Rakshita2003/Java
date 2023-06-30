public class largestOf3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 77;
        int c = 55;

        // maximum num
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("The maximum number is: " + max);

        // minimum number
        int min = 0;
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("The minimum number is: " + min);
    }
}
