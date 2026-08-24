class Solution {
    public int findMin(int[] nums) {
        
        // naive approche, the traditional one, without taking advantage of the rotated sorting property

        int min = nums[0];
        for (int i=1; i<nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}
