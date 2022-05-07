package dummy;

import java.util.Arrays;


public class ConvertStringArrtoIntArr {

    public static void main(String[] args) {
      String[]  strArray = {"a", "bv", "bc", "cd", "da", "bcd", "uuu", "bbbb", "zzzz"};


        Long[] arr=new Long[strArray.length];
        for(int i=0;i<strArray.length;i++)
        {
            arr[i]=covertString(strArray[i]);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static Long covertString(String s) {
        long res=1;

            s= s.toLowerCase();
            for(int i=0;i<s.length();i++)
            {
                res*=(int)s.charAt(i)-96;
            }

        return res;

    }
}
