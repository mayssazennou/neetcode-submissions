class Solution {
    public int[] sortArray(int[] nums) {
        
        // bubble sort (optimized)
        // O(n²) time (best case O(n)), O(1) space

        for (int i=0; i<nums.length-1; i++) {
            boolean swapped = false;
            for (int j=0; j<nums.length-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    // swap nums[j] & nums[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            // at the end of each i iteration, we make sure max([0,n-i[) is at position n-i-1
            if (!swapped) {
                // every 2 adjacent elements are in the correct order relative to each other
                // but if we perform just one swap, we run one more i iteration
                break;
            }
        }
        return nums;
    }
}