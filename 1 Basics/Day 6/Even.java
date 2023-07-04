// print if a number is odd or even

public class Even {
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int num=33;

        if(isEven(num)){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
    }
}
