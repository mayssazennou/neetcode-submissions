class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs){

            int[] charFrequency = new int[26];
            for (int i=0; i<s.length(); i++){
                charFrequency[s.charAt(i)-'a']++;
            }
            
            String key = Arrays.toString(charFrequency);
            if (map.containsKey(key)){
                map.get(key).add(s);
            }
            else {
                map.put(key, new ArrayList<>(List.of(s)));
            }
        }
        
        return new ArrayList<>(map.values());
    }
}
