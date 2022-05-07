package dummy;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        String str = "abc";
        //a,b,c,ab,ba,ac,ca,bc,cb,abc,acb,cab,bac, bca,cba
        //b

        ArrayList<String> sList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            for (int j = 0; j < str.length(); j++) {
                if (i == j) {
                    sList.add(String.valueOf(str.charAt(j)));
                } else s += str.charAt(j);
                if (!sList.contains(s))
                    sList.add(s);

            }

        }

        for (int i = str.length()-1; i >=0; i--) {
            String s = String.valueOf(str.charAt(i));
            for (int j = str.length() - 1; j >= 0; j--) {
                if (i == j) {
                    if (!sList.contains(String.valueOf(str.charAt(j))))
                        sList.add(String.valueOf(str.charAt(j)));
                } else s += str.charAt(j);
                if (!sList.contains(s))
                    sList.add(s);

            }
        }
        System.out.println(sList.size());
        for (String s : sList)
            System.out.println(s);
    }

}

