// string compression "aaabbcccdd" -> "a3b2c3d2", "abc" -> "abc"

public class Strings8 {
public static String compress(String str){
    String newstr=" ";

    for(int i=0;i<str.length();i++){
        Integer count=1;
        while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
            count++;
            i++;
        }
        newstr+=str.charAt(i);
        if(count>1){
            newstr+=count.toString();
        }
    }
    return newstr;
}

    public static void main(String[] args) {
        String str = "aaabbccc";
        System.out.println(compress(str));
    }
}
