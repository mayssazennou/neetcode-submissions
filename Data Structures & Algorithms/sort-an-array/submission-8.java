class Solution {
    public int[] sortArray(int[] nums) {
        
        // insertion sort
        // O(n²) time, O(1) space
        
        for (int i=1; i<nums.length; i++) {
            // array nums[0,i[ is sorted, insert nums[i] in the right position
            for (int j=0; j<i; j++) {
                if (nums[i]<nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        return nums;
    }
}