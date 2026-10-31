class Solution {
    public int maxSubArray(int[] nums) {
        
        // variable-size sliding window 

        int best = nums[0];
        int current = nums[0];

        for (int i=1; i<nums.length; i++) {
            current = Math.max(nums[i], current+nums[i]);
            best = Math.max(current, best);
        }

        return best;
    }
}
