package dummy;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s1, String s2)
    {
        boolean flag= true;
       if(s1!=null && s2!= null ) {
           Map<Character, Integer> s1Feq = getFequen(s1);
           Map<Character, Integer> s2Feq = getFequen(s2);


           if (s1Feq.size() == s2Feq.size()) {
               for (Character ch : s1Feq.keySet()) {
                   if (s1Feq.get(ch) != s2Feq.get(ch)) {
                       return false;
                   }
               }
           } else
               return false;
       }
       else
           return false;
        return flag;

    }

    private Map<Character, Integer> getFequen(String s1) {
        Map<Character, Integer> map= new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            Character ch=s1.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
                map.put(ch, 1);
        }
         return  map;
    }

    public static void main(String[] args) {
        String s1=null;
        String s2=null;

        if(new Anagram().isAnagram(s1,s2))
        {
            System.out.println("String is dummy.Annagram");
        }
        else
        {
            System.out.println("String is not dummy.Annagram");
        }
    }


}
