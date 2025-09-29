import java.util.HashSet;
import java.util.HashMap;

public class SubarrayWithZeroSum {

    /**
     * Checks if there exists a subarray with sum = 0.
     * Logic:
     * - Maintain prefix sum (presum).
     * - If presum becomes 0 at any index → subarray from start has sum 0.
     * - If the same presum repeats → elements between two occurrences sum to 0.
     * Uses HashSet to track seen prefix sums.
     *
     * Time: O(n), Space: O(n)
     */
    public static boolean hasZeroSumSubarray(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        int presum = 0;

        for (int i = 0; i < arr.length; i++) {
            presum += arr[i];

            if (presum == 0 || h.contains(presum)) {
                return true;
            }

            h.add(presum);
        }
        return false;
    }

    /**
     * Checks if there exists a subarray with sum = given target.
     * Logic:
     * - Maintain prefix sum (presum).
     * - If presum == sum → subarray from start has target sum.
     * - If (presum - sum) seen before → subarray between indices has target sum.
     * Uses HashSet to track prefix sums.
     *
     * Time: O(n), Space: O(n)
     */
    public static boolean hasSumSubarray(int[] arr, int sum) {
        HashSet<Integer> h = new HashSet<>();
        int presum = 0;

        for (int i = 0; i < arr.length; i++) {
            presum += arr[i];

            if (presum == sum || h.contains(presum - sum)) {
                return true;
            }

            h.add(presum);
        }
        return false;
    }

    /**
     * Finds the length of the longest subarray with sum = given target.
     * Logic:
     * - Maintain prefix sum (presum).
     * - If presum == sum → subarray from start has target sum, update max length.
     * - If (presum - sum) seen before → subarray from that index+1 to i has sum = target, update max length.
     * - Store first occurrence of presum in HashMap (to maximize subarray length).
     *
     * Time: O(n), Space: O(n)
     */
    public static int longestSubarrayWithSum(int[] arr, int sum) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int presum = 0;
        int res = -1; // -1 means no subarray found

        for (int i = 0; i < arr.length; i++) {
            presum += arr[i];

            if (presum == sum) {
                res = Math.max(res, i + 1);
            }

            if (h.containsKey(presum - sum)) {
                res = Math.max(res, i - h.get(presum - sum));
            }

            if (!h.containsKey(presum)) {
                h.put(presum, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, -3, 1, 6};
        int[] arr2 = {1, 2, 3, -3, -2, 5};
        int[] arr3 = {5, 8, -4, -4, 9, -2, 2};

        // Test for hasZeroSumSubarray
        System.out.println("Test hasZeroSumSubarray:");
        System.out.println(hasZeroSumSubarray(arr1)); // true → subarray [2, -3, 1]
        System.out.println(hasZeroSumSubarray(arr2)); // true → subarray [3, -3]
        System.out.println(hasZeroSumSubarray(new int[]{1, 2, 3})); // false

        // Test for hasSumSubarray
        System.out.println("\nTest hasSumSubarray (sum = 3):");
        System.out.println(hasSumSubarray(arr1, 3)); // true → subarray [-3, 1, 6, -1] etc.
        System.out.println(hasSumSubarray(arr2, 0)); // true → subarray [3, -3]
        System.out.println(hasSumSubarray(arr3, 7)); // true → subarray [5, 8, -4, -4, 9, -2, -5]

        // Test for longestSubarrayWithSum
        System.out.println("\nTest longestSubarrayWithSum:");
        System.out.println(longestSubarrayWithSum(arr1, 0)); // 3 → [2, -3, 1]
        System.out.println(longestSubarrayWithSum(arr2, 5)); // 6 → [1,2,3,-3,-2,5]
        System.out.println(longestSubarrayWithSum(arr3, 0)); // 5 → [8, -4, -4, 9, -2]
        System.out.println(longestSubarrayWithSum(arr3, 100)); // -1 (not found)
    }
}
