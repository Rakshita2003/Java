Question: The given task is to take  an integer as input from the user and print that integer in Java language. 
  
Solution:

import java.util.Scanner;

 class Solution{
   public static void main(String[] args){
     System.out.println("Enter an integer value: ");
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     System.out.println("The entered value is: " + num);
   }
 }
