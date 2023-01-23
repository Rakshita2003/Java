public class Main{
    public static void main(String[] args){
        int temp,a=3,b=6;

        temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping, the value of a is " + a+" and b is "+b);
    }
}
