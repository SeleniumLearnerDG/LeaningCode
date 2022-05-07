package dummy;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalTestcase=sc.nextInt();
       for(int i=0;i<totalTestcase;i++)
       {
           int tc=sc.nextInt();
           int count =0;
           for(int j=1;j<=tc;j++)
           {
               if(isSpecialNumber(j))
               {
                   System.out.println(j);
                   count++;
               }
           }
           System.out.println(count);
       }



    }

    private static boolean isSpecialNumber(int num) {
        ArrayList<Integer> arr= new ArrayList<>();
            while(num>0)
            {
                arr.add(num%10);
                num/=10;
            }
            int quSum=0;
            int product=1;
            for(int i=0;i<arr.size();i++)
            {
                quSum+=Math.pow(arr.get(i),4);
                product*=arr.get(i);
            }
        int gcd =1;
        for(int i = 1; i <= quSum && i <= product; i++)
        {

            if(quSum%i==0 && product%i==0)

                gcd = i;
        }
        if(gcd==1)
            return false;
        return true;
    }
}