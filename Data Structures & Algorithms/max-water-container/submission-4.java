class Solution {
    public int maxArea(int[] heights) {
        
        // two pointers

        int maxArea = 0;
        int left = 0, right = heights.length-1;
        
        while (left<right) {
            int currentArea = (right-left)*Math.min(heights[left], heights[right]); 
            maxArea = Math.max(maxArea, currentArea);
            // Move the pointer with the smaller height inward
            if (heights[left] > heights[right]) {
                right--;
            }
            else {
                left++;
            }
        }
        return maxArea;
    }
}
