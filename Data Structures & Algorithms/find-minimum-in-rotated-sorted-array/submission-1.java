class Solution {
    public int findMin(int[] nums) {
        
        if (nums.length==1) return nums[0];
        
        /*
        KEY INSIGHT: In a rotated sorted array, the minimum is the ONLY element
        that is smaller than its predecessor. We use binary search to find it.
        
        The magic of comparing nums[mid] with nums[right]:
        - If nums[mid] > nums[right]: The rotation break MUST be to the right of mid
          Because if the right side was sorted, we'd have nums[mid] < nums[right]
          So the minimum is in (mid, right], and mid itself cannot be the minimum
        
        - If nums[mid] <= nums[right]: The right side IS sorted
          So the minimum must be in [left, mid], including mid as a candidate
        */

        int left = 0;
        int right = nums.length-1;
        while (left<right) {
            int mid = left + (right-left)/2;
            if (nums[mid]>nums[right]){
                // min is in the right segment, and mid is NOT the min
                left = mid + 1;
            }
            else {
                // min is in the left segment (including mid)
                right = mid;
            }
        }
        // loop stops when left=right
        return nums[left]; 
    }
}
