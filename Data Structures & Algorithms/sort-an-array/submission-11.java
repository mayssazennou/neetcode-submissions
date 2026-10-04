class Solution {
    public int[] sortArray(int[] nums) {

        // bubble sort enhanced 2
        // O(n²) time (best case O(n)), O(1) space

        int n = nums.length;

        for (int i=0; i<n; i++) {
            // at each iteration i, nums[n-i-1] is placed at its right position
            boolean swapped = false;
            for (int j=0; j<n-i-1; j++) {
                if (nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            // if no swap was made at iteration i, it means the array is sorted
            if (!swapped) return nums;
        }

        return nums;        
    }
}