public class ReverseArray {

    /*
        Used 2-pointer approach here.

        The 2-pointer approach means we take two indices (or "pointers"):
        - one starting from the beginning (left)
        - one starting from the end (right)
        
        Then we move both pointers towards the center, swapping the elements
        at those indices each time. This way, the array is reversed in place
        without needing extra space.

        Implementation here:
        - left starts at index 0
        - right starts at index nums.length - 1
        - while left < right:
            swap(nums[left], nums[right])
            move left forward (left++)
            move right backward (right--)

        Time Complexity: O(n) 
            -> We visit each element at most once (half of them are swapped).
        Space Complexity: O(1)
            -> Only a temporary variable 'temp' is used for swapping,
               no extra data structures are required.
    */

    public static void main(String []args){
        int[] nums =  {2,4,6,8,0};

        int left = 0;
        int right = nums.length -1;

        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }

        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
