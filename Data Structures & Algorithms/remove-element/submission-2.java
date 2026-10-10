class Solution {
    public int removeElement(int[] nums, int val) {
        
        // O(n) time, O(1) space

        int writer = 0;
        for (int reader=0; reader<nums.length; reader++) {
            if (nums[reader] != val) {
                nums[writer++] = nums[reader];
            }
            // else (nums[reader] == val)
            // skip it by keeping writer in its position 
            // so that it could be overwritten by the next num != val
        }

        return writer;
    }
}