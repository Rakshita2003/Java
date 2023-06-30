public class PrimeOrNotPrime {
    public static void main(String[] args) {
       int num = 4;

       int i=2, count=0;
       while(i<=num/2){
        if(num%i==0){
            count++;
            break;
        }
        i++;
       }
       if(count==0){
        System.out.println("prime");
       }else{
        System.out.println("Not Prime");
       }
    }
}