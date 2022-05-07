package dummy;

import dummy.Anagram;

import java.util.*;

public class Annagram {

    public static void main(String[] args) {
        String s = "badc";
        String[] str = {"abbc", "abc", "adce", "abcd", "adcb", "cbad"};
        if (s == null) System.out.println("String should not empty");
        else {
            List<String> anngramList = findAnagram(str, s);

            System.out.println(anngramList);
        }

        Stack<Integer> stack= new Stack<>();

    }

    private static List<String> findAnagram(String[] str, String s) {

        List<String> anList = new ArrayList<>();
        if (s != null) {
            Map<Character, Integer> sMap = findFeq(s);
            for (int i = 0; i < str.length; i++) {
                if (isAnagram(str[i], sMap)) {
                    anList.add(str[i]);
                }
            }
        }
        return anList;
    }

    private static Map<Character, Integer> findFeq(String s) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (sMap.containsKey(ch)) {
                sMap.put(ch, sMap.get(ch) + 1);
            } else
                sMap.put(ch, 1);

        }

        return sMap;
    }

    private static boolean isAnagram(String s, Map<Character, Integer> sMap) {
        Map<Character, Integer> stMap = findFeq(s);
        boolean flag = true;
        if (sMap.size() == stMap.size()) {
            for (Character ch : sMap.keySet()) {
                if (stMap.get(ch) != sMap.get(ch))
                    flag = false;
            }
        } else
            flag = false;

        return flag;

    }
}
