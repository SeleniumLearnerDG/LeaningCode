package dummy;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateElement {

    public static void main(String[] args) {
        /*String str= "DikshaGupta";
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i< str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }

        for(Character ch:map.keySet())
        {
            if(map.get(ch)>1)
                System.out.println(ch);
        }*/

        Integer[] arr={0,0,0,0,1,2,3,4,3,4};

        for(int  firstZero=arr.length-1, curr=arr.length-1; curr>=0; curr-- )
        {
            if(arr[curr]!=0)
            {
                int temp= arr[curr];
                arr[curr]=arr[firstZero];
                arr[firstZero--]= temp;
            }
        }

        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");

//        Select * from table1 inner join table2 on table1.id= table2.id;
//
//       select min(salary) from ( select * from emp order by salary desc limit 3)

    }
}
