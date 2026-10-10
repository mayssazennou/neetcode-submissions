class Solution {
    public int majorityElement(int[] nums) {
        
        // O(n) time, O(n) space
        
        Map<Integer, Integer> map = new HashMap<>();
        int maj = nums[0];
        for (int num: nums) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);
            if (freq > map.get(maj)) {
                maj = num;
            }
        }
        return maj;
    }
}