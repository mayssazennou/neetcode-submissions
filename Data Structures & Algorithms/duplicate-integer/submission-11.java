class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        // sorted array
        // O(nlog(n)) time, O(1) space

        if (nums.length<2) return false; 

        Arrays.sort(nums);

        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]==nums[i+1]) return true;
        }

        return false;
    }
}