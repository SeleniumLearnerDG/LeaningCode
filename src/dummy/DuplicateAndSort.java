package dummy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateAndSort {
    public static void main(String[] args) {

        //aagdi //adgi  -a-2
//        TreeMap<Character, Integer> chMap= new dummy.DuplicateAndSort().count(str);
//
//        String s="";
//        for(Character ch:chMap.keySet())
//        {
//            s+=ch;
//            if(chMap.get(ch)>1)
//                System.out.println(ch+">>>"+ chMap.get(ch));
//        }
//
//        System.out.println(s);
//
//        Map m1= new HashMap();

//        str.replace("&","").replace("(","");

//        System.out.println((int)'A');
//        System.out.println((int)'Z');
//        System.out.println((int)'a');
//        System.out.println((int)'z');
//        System.out.println((int)'1');
//        System.out.println((int)'9');

//        System.out.println((int)'0');

        String s="";
       // A-Za-z1-9

        String str= "a&(7dvdf)&)(*90hkk/\"";
    for(int i=0;i<str.length();i++)
    {
        Character ch= str.charAt(i);
        if(((int)ch>=65 && (int)ch<=90) || ((int)ch>=97 && (int)ch<=122) || ((int)ch>=48 && (int)ch<=59))
            s+=ch;

    }

        System.out.println(s);

    }
     public TreeMap<Character, Integer> count(String s)
     {
         TreeMap<Character, Integer> chMap= new TreeMap<>();
        for(int i=0; i<s.length();i++)
        {
            Character ch=s.charAt(i);
            if(chMap.containsKey(ch))
            {
                chMap.put(ch, chMap.get(ch)+1);
            }
            else
                chMap.put(ch, 1);
        }
        return chMap;
     }


}
