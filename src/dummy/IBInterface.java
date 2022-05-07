package dummy;

public interface IBInterface  extends  IAinterface, IAA{
    public void display();

    class GFG1 {

        // Returns maximum sum in a subarray of size k.
        public static int maxSum(int arr[], int n, int k)
        {
            // k must be smaller than n
            if (n < k)
            {
                System.out.println("Invalid");
                return -1;
            }

            // Compute sum of first window of size k
            int res = 0;
            for (int i=0; i<k; i++)
                res += arr[i];

            // Compute sums of remaining windows by
            // removing first element of previous
            // window and adding last element of
            // current window.
            int curr_sum = res;
            int index=0;
            for (int i=k; i<n; i++)
            {
                curr_sum += arr[i] - arr[i-k];
                if(curr_sum>res)
                    index=i-k+1;
                res = Math.max(res, curr_sum);
            }

            System.out.println(index);
            for (int i=index;i<index+k;i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            return res;
        }

        /* Driver program to test above function */
        public static void main(String[] args)
        {
            int arr[] = {1, 4, 2, 30, 2, 3, 1, 0, 20};
            int k = 4;
            int n = arr.length;
            System.out.println(maxSum(arr, n, k));
        }
    }
}
