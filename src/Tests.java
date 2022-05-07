import java.util.*;

public class Tests {


    public static void main(String[] args) {

        String s= "hello";

      s=  s + " world";



    }








    public  static void  isFibanacci()
    {
        long num1=1;
        long num2= 1;
        Set<Long> allList = new HashSet<>();
        Set<Long> primeList = new HashSet<>();
      while(true)
      {
          long num= num1+ num2;
          if(num>100)
              break;
          if(isPrime(num))
              primeList.add(num);
          else
              allList.add(num);
          num2=num1;
          num1=num;

      }

        System.out.println("All List: "+allList);
        System.out.println("prime List: "+primeList);
    }



    public  static  long  isFibanacci(long n, Set<Long> allList, Set<Long> primeList,  Map<Long, Long> preCalCu)
    {

        if(preCalCu.containsKey(n))
            return preCalCu.get(n);
        if(n==0 ||  n==1)
        {
            allList.add(1l)  ;
            preCalCu.put(n,1l);
            return 1l;
        }


        long val=isFibanacci(n-1,allList, primeList,preCalCu);
        long val2=isFibanacci(n-2,allList, primeList,preCalCu);

        long num= val+ val2;

                if(isPrime(num))
                {
                    primeList.add(num);
                }
             else
                {
                    allList.add(num)  ;
                }
            preCalCu.put(n, num);
        return  num;
    }

    private static boolean isPrime(long num) {

        if(num==1) return false;
        if(num==2)  return true;
        for(int i=2; i<Math.sqrt(num); i++)
        {
            if(num%2==0)
                return false;
        }
        return true;
    }


}
