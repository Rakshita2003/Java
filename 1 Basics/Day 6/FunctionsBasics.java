// Basics of functions

public class FunctionsBasics {
//Q1
    public static void printMyName(String name) {
        System.out.println(name);
    }
//Q2
    public static int calcSum(int a, int b) {
        return a + b;
    }
//Q3
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * n + " ");
        }
        System.out.println();
    }
//Q4
    public static int average(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3;
    }


//main function
    public static void main(String[] args) {
        String name = "Hello World";
        System.out.println(name);

        int a = 5;
        int b = 5;
        System.out.println("The sum of two numbers is " + calcSum(a, b));

        int n = 2;
        table(n);

        System.out.println("The average of three numbers is " + average(2, 4, 9));
    }
}
