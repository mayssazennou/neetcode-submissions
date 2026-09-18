class Solution {
    public int[] sortArray(int[] nums) {

        // swap-heavy selection sort

        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]>nums[j]) {
                    // swap nums[i] & nums[j] if nums[j] is inferior
                    // that way we make sure min(nums[i,n[) will eventually end up at position i
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}