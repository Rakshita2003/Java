import java.util.Scanner;

class Main{
  static void vowel_Or_Consonant(char y){
        if(y=='a'|| y=='e'|| y=='i'|| y=='o'|| y=='u')
            System.out.println("It is a vowel");
        else
            System.out.println("It is a consonant");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        String y=sc.nextLine();
        vowel_Or_Consonant('y');
    }
}
