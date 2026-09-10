class Solution {
    public int[] sortArray(int[] nums) {

        // swap-heavy selection sort

        int temp;
        for (int i=0; i<nums.length; i++) {
            // select minimum element and places it at the correct position at each pass
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}