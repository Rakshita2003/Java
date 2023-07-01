// Calculator using switch statement

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
    
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
                    // one sigle word. only character of 0 of that word

        switch(operator){
            case '+': System.out.println(a + " + " +b +" = " + (a+b));
            break;
            case '-': System.out.println(a + " - " + b +" = "+ (a-b));
            break;
            case '*': System.out.println(a + " * " + b +" = "+ (a*b));
            break;
            case '/': System.out.println(a + " / " + b +" = "+ (a/b));
            break;
            case '%': System.out.println(a + " % " + b +" = "+ (a%b));
            break;
            default: System.out.println("Enter the correct operator!");
        }
    }
}
