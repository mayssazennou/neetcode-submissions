class Solution {
    public int[] sortArray(int[] nums) {
        
        // bubble sort
        // O(n²) time, O(1) space

        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    // swap nums[j] & nums[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            // at the end of each j iteration, we make sure max([0,n-i[) is at position n-i-1
        }
        return nums;
    }
}