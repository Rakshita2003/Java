// Reverse the given number
//original number ko reverse karna hai

 public class Reverse {
  public static void main(String[] args) {
    int n = 10899;
    int rev = 0;

    while(n>0){
        int lastDigit = n%10;         
        rev = (rev*10) + lastDigit ;
         n= n/10;                   
    }
    System.out.println(rev);

    // rev = 0
    // rev = (0*10)+9=9
    // rev = (9*10)+ 9 = 99
    // rev = (99*10)+8 = 998 ...
  }
}
