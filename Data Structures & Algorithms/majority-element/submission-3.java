class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        int maxFreq = 0;
        int majorityElement = 0;         

        for (int num: nums){
            int freq = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, freq);
            if (freq > maxFreq) {
                maxFreq = freq;
                majorityElement = num;
            }
        }
        
        return majorityElement;
    }
}