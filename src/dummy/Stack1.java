package dummy;

import java.util.ArrayList;

public class Stack1 {
    ArrayList<Integer> arrayList= new ArrayList<>();
    Integer max=Integer.MIN_VALUE;
    Integer secondMax=Integer.MIN_VALUE;
    public void push(Integer val)
    {
        if(arrayList.size()>1) {

        }
        max = Math.max(val, max);
        arrayList.add(val);
    }

    public Integer pop()
    {
        Integer element= arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        if(max==element)
        {
            max=secondMax;
            secondMax=findSecond(arrayList);
        }
        return element;
    }

    private Integer findSecond(ArrayList<Integer> arrayList) {
        return  null;
    }


}




