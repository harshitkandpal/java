import java.util.HashSet;

public class SubarrayWithZeroSum {

    public static boolean hasZeroSumSubarray(int[] arr){
        
        HashSet<Integer> h = new HashSet<>();
        int presum = 0;

        for(int i=0; i<arr.length;i++){
            presum+=arr[i];

            if(presum==0) return true;

            if(h.contains(presum)) return true;

            h.add(presum);
        }
        
        return false;
    }
    

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        if (hasZeroSumSubarray(arr)) {
            System.out.println("Subarray with zero sum exists");
        } else {
            System.out.println("No subarray with zero sum");
        }
    }
}
