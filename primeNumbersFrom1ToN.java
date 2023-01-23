import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int i,n,counter,j;
        System.out.println("Enter the n value: ");
        n=sc.nextInt();

        for (i=2;i<=n;i++){
            counter=0;
            for (j=1;j<=n;j++){
                if(i%j==0){
                    counter++;
                }
            }
            if (counter==2)
             System.out.println(i+" ");
        }
    }
}
