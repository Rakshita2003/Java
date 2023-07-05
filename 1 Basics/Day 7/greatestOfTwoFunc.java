public class greatestOfTwoFunc {
    public static int greatestTwo(int a, int b){
        if(a>b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
       System.out.println("The greatest of two numbers is " + greatestTwo(5, 10));
    }
}
