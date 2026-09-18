class Solution {
    public int[] sortArray(int[] nums) {
        
        // selection sort
        // O(n²) time, O(1) space

        for (int i=0; i<nums.length-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<nums.length; j++) {
                if (nums[minIndex]>nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }
}