//import java.util.Arrays;
//
//public class PowerOfArr {
//
//    public static void main(String[] args) {
//
//        int[] arr= {-5, -2, 0, 3,6};// arr= {-5, -2, 0, 3,36} // {3, -2 , 0, 25, 36 } // {0, -2, 3, 25, 36}
//        // {0, -2, 9, 25, 36}
////        j=4--- if(arr[i]>arr[j]//
//        {
//
//        }
//
//        powerOfSortedArr(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void powerOfSortedArr(int[] arr) {
//
//        for(int i=0, j=arr.length-1; i<j;)
//        {
//            if(Math.abs(arr[i])>Math.abs(arr[j]))
//            {
//                int temp= arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//            }
//            arr[j]=(int)Math.pow(arr[j],2);
//            j--;
//        }
//    }
//
//
//
//    }
//
//    public static void reverseArray(char[] arr)
//            {
//
////                arr={a,'2','1',b,23,1,z};
////                {z,'2','1',b,2,1,a}
//
//                for(int i=0, last= arr.length-1;i<arr.length/2;)
//                {
//                    if(i<last)
//                    {
//                        if(isNum(arr[i])) i++;
//                        else if(isNum(arr[last])) last--;
//
//                        else {
//                            char temp= arr[i];
//                            arr[i++]= arr[last];
//                            arr[last--]=temp;
//                    }
//                    }
//}
//
//}
