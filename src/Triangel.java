import java.util.LinkedList;
import java.util.List;

public class Triangel{

    public static void main(String[] args) {

        String str= "cocco";
        List<String> list= new LinkedList<>();
        for(int i=0; i<str.length(); i++)
        {

            for(int j=i+1; j<str.length();j++)
            {
                if(j==(str.length()-1)) j=j+1;
//                System.out.println(str.substring(i,j));
                if(isPalindrom(str.substring(i,j)))
                {
                    list.add(str.substring(i,j));
                }
            }
        }

        System.out.println(list);

    }

    public  static boolean isPalindrom(String str)
    {
        boolean flag=true;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                flag=false;
                break;
            }
        }

        return  flag;
    }

}
