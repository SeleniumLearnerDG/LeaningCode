import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    //string str="rgshs";:-- sgshr
//            str=

    public static void main(String[] args) {
        String str="rgshs";
        System.out.println(sorting(str));
    }

    private static String sorting(String str) {
        char[] ch= str.toCharArray();
        int length= str.length()%2==0?str.length()/2:str.length()/2+1;
        char[] arrayList= new char[length];

            for(int i=0,j=0; i<ch.length;i++)
            {
                if(i%2==0)
                    arrayList[j++]=ch[i];
            }

            for(int i=0;i<arrayList.length;i++)
            {
                for(int j=0;j<arrayList.length;j++)
                {
                    if(i==j)
                        continue;
                    else {
                        if(arrayList[i]>arrayList[j])
                        {
                            char temp=arrayList[i];
                            arrayList[i]=arrayList[j];
                            arrayList[j]=temp;
                        }

                    }
                }
            }

        for(int i=0,j=0; i<ch.length;i++)
        {
            if(i%2==0)
                ch[i]=arrayList[j++];
        }

        return Arrays.toString(ch);
    }
}
