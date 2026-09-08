class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (Integer num: nums){
            int freq = freqMap.getOrDefault(num, 0) + 1;
            if (freq > nums.length/2){
                return num; // assuming majority element exists and is unique
            }
            freqMap.put(num, freq); // else continue updating freqMap
        }

        // if existence and unicity condition is met, this code is never reached
        // it only avoids the compilation error: missing return statement
        return nums[nums.length-1]; 
    }
}