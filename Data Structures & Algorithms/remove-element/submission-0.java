class Solution {
    public int removeElement(int[] nums, int val) {
        
        // two pointers, one to read elements, the other to write the ones!=val
        int reader = 0;
        int writer = 0;
        while ( reader<nums.length ) {
            if (nums[reader]!=val){
                nums[writer] = nums[reader];
                writer++;
            }
            reader++;
        }

        return writer; //  // number of written elements; number of elements!=val
    }
}