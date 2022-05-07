package dummy;

public class CommonSubString {

    public String commonSubString(String[] arr)
    {
        String common= null;
        if(arr!=null)
        {
            if(arr.length==1)
                return  arr[0];
            else
            {
                common=arr[0];
                for(int i=1;i<arr.length;i++)
                {
                    common=findCommon(common,arr[i]);

                }
            }
        }
        return common;
    }

    private String findCommon(String common, String s) {
        String s2="";

            if (common != null && s != null) {
                String smallest= common.length()<s.length()?common:s;
                String largest= common.length()>=s.length()?common:s;
                for(int i=0;i<smallest.length();i++)
                {
                    if(largest.contains(s2+smallest.charAt(i)))
                    {
                        s2+=smallest.charAt(i);
                    }
                }

            }

            return s2;

    }

    public static void main(String[] args) {
        //di diks dive dokjgrjrne
        String[] arr={"diksha","di","diks","di", "dik", "diabc"};
        System.out.println(new CommonSubString().commonSubString(arr));
    }
}
