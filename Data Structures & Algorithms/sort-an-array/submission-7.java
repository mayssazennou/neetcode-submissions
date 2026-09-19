class Solution {
    public int[] sortArray(int[] nums) {
        
        // insertion sort
        // O(n²) time, O(1) space
        
        for (int i=1; i<nums.length; i++) {
            // build the sorted array one item at a time 
            // by inserting element at position i at its right position in the already sorted array nums[0,i[
            for (int j=0; j<i; j++) {
                if (nums[i]<nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        return nums;
    }
}