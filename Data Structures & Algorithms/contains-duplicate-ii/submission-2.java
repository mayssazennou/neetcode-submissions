class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if (k==0) return false;

        // fixed-size set with size k (window's size)
        Set<Integer> set = new HashSet<>();
        
        int r = k;
        for (int l=0; l<nums.length; l++){
            
            if ( set.contains(nums[l])) {
                return true;
            }

            if (l==r) { // set.size()==k

                // remove first added element
                set.remove(nums[r-k]);

                // move the size fixed-size window forward
                r++; // guarantee that r-l <= k
            }

            set.add(nums[l]);
        }

        return false;
    }
}