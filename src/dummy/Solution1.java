package dummy;

public class Solution1 {



        static int minimizedMaximumNumber(int n, int k, int a[]) {
            // Write your code here.
            for(int i=0;i<k;i++)
            {
                int max=findMax(a);
                if(max==1)
                    return 1;
                a=update(a,max);
            }
            return findMax(a);
        }

    private static int[] update(int[] a, int max) {
           int[] a1= new int[a.length+1];
           int k=0;
           int curr=0;
           boolean flag=false;
           while(k<a1.length)
           {
               if(a[curr]==max && !flag)
               {
                   a1[k++]=max/2;
                   a1[k++]=max-max/2;
                   curr++;
                   flag=true;
               }
               else
                   a1[k++]=a[curr++];
           }
           return a1;
    }

    private static int findMax(int[] a) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }
        return max;
    }

    public static void main(String[] args) {
            int[] a={7 ,3 ,11, 10 ,6 ,8  };
        System.out.println(minimizedMaximumNumber(6,8,a));
    }

}
