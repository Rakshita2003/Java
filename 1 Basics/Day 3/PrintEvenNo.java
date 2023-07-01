// print even no.s from 9 to 60

public class PrintEvenNo {
    public static void main(String[] args) {

        int start = 9;
        int end = 60;

        System.out.print("List of even numbers from " + start+ " to " + end +" is: ");

        for(int i = start; i<=end; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
