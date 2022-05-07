package dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

;

// Main class should be named 'dummy.Solution'
class Solution {
    public static void main(String[] args) {
        Integer[] arr = {2, 2, 2, 3, 4, 5, 1, 1, 1};
//        Object[] oputArr = new dummy.Solution().getMostOcc(arr);
//        System.out.println(Arrays.toString(oputArr));

        String str = "{{}()[]}";
        System.out.println(new Solution().validateClosingSyntex(str));
    }


    public boolean validateClosingSyntex(String str) {
        Stack<Character> stack = new Stack<>();
        String brackets = "(){}[]";
        String openingBrackets = "({[";
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!brackets.contains(String.valueOf(ch))) {
                continue;
            }

            if (openingBrackets.contains(String.valueOf(ch))) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    Character post = stack.peek();
                    if (ch == ')' && post != '(')
                        return false;
                    else if (ch == ']' && post != '[')
                        return false;
                    else if (ch == '}' && post != '{')
                        return false;

                    stack.pop();
                } else
                    return false;
            }

        }

        if (stack.isEmpty())
            return true;
        else return false;

    }


    public Object[] getMostOcc(Integer[] arr) //arr is Nulll, Other Interger
    {
        ArrayList<Integer> alist = new ArrayList<>();
        int max = 1;
        HashMap<Integer, Integer> mMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer val = arr[i];
            if (mMap.containsKey(val)) {
                mMap.put(val, mMap.get(val) + 1);
                max = Math.max(max, mMap.get(val));
            } else
                mMap.put(val, 1);
        }

        for (Integer val : mMap.keySet()) {
            if (max == mMap.get(val)) {
                alist.add(val);
            }
        }


        return alist.toArray();

    }
}
