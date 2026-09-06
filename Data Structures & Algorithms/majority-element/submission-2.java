class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int majorityElement = 0; 
        // initialize with any value to avoid a compilation error
        // it will be overwritten anyway assuming majorityElement always exists in the array
        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            if (entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        return majorityElement;
    }
}