public class UniqueNums {

    /*
        Problem Statement:
        Given a non-empty array of integers where every number appears exactly twice 
        except for one number, find and print that single unique number.

        Approach (using XOR):
        - XOR has special properties:
            * a ^ a = 0      (any number XOR itself = 0)
            * a ^ 0 = a      (any number XOR 0 = the number itself)
            * XOR is commutative and associative.
        - So if we XOR all numbers in the array, the pairs cancel out (become 0),
          and we are left with the unique number.

        Example:
        nums = {1, 1, 4, 2, 2, 3, 3}
        -> 1 ^ 1 ^ 4 ^ 2 ^ 2 ^ 3 ^ 3
        -> (1 ^ 1) ^ (2 ^ 2) ^ (3 ^ 3) ^ 4
        -> 0 ^ 0 ^ 0 ^ 4
        -> 4

        Time Complexity: O(n)   // traverse array once
        Space Complexity: O(1)  // only a single variable 'result' is used
    */
    
    public static void main(String [] args){
        int[] nums = {1,1,4,2,2,3,3};
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result ^= nums[i];
        }
        System.out.println(result);
    }
}
