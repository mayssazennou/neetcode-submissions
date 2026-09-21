class Solution {
    public int search(int[] nums, int target) {
        
        // iterative approach
        // O(log(n)) time, O(1) space

        int start = 0;
        int end = nums.length;

        while (start < end) {
            int midIndex = start + (end-start)/2;
            if (nums[midIndex] == target) {
                return midIndex;
            }
            if (nums[midIndex] > target) {
                end = midIndex;
            }
            else {
                // nums[midIndex] < target
                start = midIndex + 1;
            }
        }

        return -1;
    }
}
