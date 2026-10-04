class Solution {
    public int[] sortArray(int[] nums) {

        // bubble sort enhanced 1
        // O(n²) time, O(1) space

        int n = nums.length;

        for (int i=0; i<n; i++) {
            // at each iteration i, nums[n-i-1] is placed at its right position
            for (int j=0; j<n-i-1; j++) {
                if (nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        return nums;        
    }
}