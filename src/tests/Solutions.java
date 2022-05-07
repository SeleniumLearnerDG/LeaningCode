package tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int remain=target-nums[i];
            if(map.containsKey(remain))
            {
                int arr[]= new int[2];
                arr[0]=map.get(remain);
                arr[1]=i;
                System.out.println(Arrays.toString(arr));
                return arr;
            }
            System.out.println(nums[i]);
            map.put(nums[i],i);
        }

        return null;
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        System.out.println(twoSum(arr,9));
    }
}
