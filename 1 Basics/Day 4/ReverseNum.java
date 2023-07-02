// Print reverse of a number
// yahape print kiya hai reverse number ko

public class ReverseNum {
    public static void main(String[] args) {
        int n = 10899;

        while(n>0){
        int lastDigit = n%10;      // gives lastdigit
        System.out.print(lastDigit + " ");
        n = n/10;                   //remove the last digit
        }
       System.out.println();

                   // 9 9 8 ...
       // (1089)
       //  (108)
       // (10)  ....

    }
}
