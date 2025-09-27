public class SubArrayWithLargestSum {

    /*
        Problem Statement:
        Given an integer array (which may contain negative numbers), 
        find the contiguous subarray with the largest sum and return that sum.

        Example:
        nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}
        The subarray {4, -1, 2, 1} has the largest sum = 6.

        Approach (Kadane's Algorithm):
        - Keep a running sum of the current subarray.
        - At each step, decide whether to:
            1) extend the current subarray by including nums[j], OR
            2) start a new subarray from nums[j].
        - Update the maximum sum found so far at each step.

        Explanation:
        - Initialize sum = nums[0] and maxSum = nums[0].
        - Traverse the array from index 1:
            * Add nums[j] to sum (extend subarray).
            * If starting fresh from nums[j] is better (i.e., nums[j] > sum), 
              reset sum to nums[j].
            * Update maxSum = max(maxSum, sum).
        - By the end, maxSum holds the largest subarray sum.

        Time Complexity: O(n) 
            -> We only traverse the array once.
        Space Complexity: O(1)
            -> Only a few variables (sum, maxSum) are used.
    */
    
    public static void main(String []agrs){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = nums[0];
        int sum = nums[0];

        for(int j = 1; j < nums.length; j++){
            sum = Math.max(nums[j], sum + nums[j]); // choose extend vs restart
            maxSum = Math.max(maxSum, sum);         // update global max
        }

        System.out.println(maxSum);
    }
}
