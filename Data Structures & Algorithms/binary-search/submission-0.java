class Solution {
    public int search(int[] nums, int target) {
        
        // recursive approach 

        return helper(nums, 0, nums.length, target);
    } 

    private int helper(int[] nums, int start, int end, int target) { 
        
        // start included, end excluded
        int n = end - start; // length of the search window

        if (n < 2) { 
            // length is 0 or 1
            if (n == 1 && nums[start]==target) return start;
            return -1;
        }

        int midIndex = start + n/2; // (start+end)/2

        if (nums[midIndex] == target) {
            return midIndex;
        }
        if (nums[midIndex] > target) {
            // search in the left portion
            return helper(nums, start, midIndex, target);
        }
        // nums[midIndex] < target
        // search in the right portion
        return helper(nums, midIndex + 1, end, target);
    }
}
