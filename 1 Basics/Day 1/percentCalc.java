//  CBSE Board Percentege Calculator of a student with 5 subjects

import java.util.Scanner;

public class percentCalc {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating marks of students based on their CBSE Subjects");
        System.out.println("Enter the marks of English: ");
        float eng  = sc.nextFloat();
         System.out.println("Enter the marks of Maths: ");
        float mat =sc.nextFloat();
         System.out.println("Enter the marks of Science: ");
        float sci = sc.nextFloat();
         System.out.println("Enter the marks of History: ");
        float his = sc.nextFloat();
         System.out.println("Enter the marks of Geography: ");
        float geog = sc.nextFloat();

        float totalmrks = eng + mat + sci + his + geog;
        System.out.println("The total marks of student is: " + totalmrks);
        float percentege = (totalmrks / 500)* 100;
        System.out.println("The % of student is: " + percentege);
    }

}
