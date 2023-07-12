// for a given set of strings, print the largest string - Lexicographic i.e means it checks the first letter of the alphabet

public class Strings6 {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest=fruits[0];

        for(int i=0; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.print(largest);
    }
}
