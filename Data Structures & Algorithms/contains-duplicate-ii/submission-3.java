class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if (k==0) return false;

        Set<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++) {

            if (set.contains(nums[i])) return true;

            if (set.size() >= k){
                // if window size exceeds k, remove the oldest element
                set.remove(nums[i-k]); // i > k
            }

            set.add(nums[i]);
        }

        return false;
    }
}