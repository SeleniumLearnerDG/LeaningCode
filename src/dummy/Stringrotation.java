package dummy;

//Abcde:
////1: eabcd
////2: deabc
////3:  5+3-1+0=7/5=2--0th
public class Stringrotation {
    public static void main(String[] args) {
        String str = "abcde";
        String str3= "abcdeabcde";

        String str2 = "cdeab";

        System.out.println(isSimilar(str, str2));
//        System.out.println(rotate(str, 3));
    }

    private static boolean isSimilar(String str, String str2) {
        boolean flag = true;
        if (str.length() == str2.length()) {
            if (str.indexOf(str2.charAt(0)) < 0) {
                flag = false;

            } else {
//                int index = str.indexOf(str2.charAt(0));
//                for (int i = 0; i < str2.length(); i++) {
//                    if (str.charAt(index) != str2.charAt(i)) {
//                        flag = false;
//                        break;
//                    }
//                    else
//                    {
//                        index=(index+1)%str.length();
//                    }
//                }

                int index = str.indexOf(str2.charAt(0));
                String newstr=str.substring(index)+str.substring(0,index);
                if(str2.equals(newstr))
                    return true;
                else return false;
            }

        } else return false;
        return flag;
    }


    private static String rotate(String str, int rota) {
        String newStr = "";
        rota %= str.length();
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt((str.length() + i - rota) % str.length());
        }
        return newStr;
    }


}
