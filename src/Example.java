import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        String str = "aaaaaaaa";
        System.out.println(isPalindrome(str));

    }

    private static boolean isPalindrome(String str) {
        if (str.isEmpty() || str.length() == 1 )
            return true;
        else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1,str.length()-1));
        }
        else return false;
    }



    //Str=aaaaaa
    //a==str.charAt(6)---- a==a
    //str.subString(1,6)---- aabaa
    //Str=aabaa
    //else  a==str.charAt(4)



//    public String revese(String s)
//    {
//        if(s.length()==1)
//            return s;
//        return s.charAt(s.length()-1)+revese( s.substring(0,s.length()-1));
//
//    }

}
