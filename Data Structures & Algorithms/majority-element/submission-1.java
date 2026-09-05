class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (Integer num: nums){
            int freq = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, freq); 
        }

        // assuming majority elements exists, 
        // answer is the elements having max value in freqMap
        return Collections.max(freqMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}