class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Map<Character,Integer>, List<String>> map = new HashMap<>(); 
        // maps a map of character frequencies to the list of its anagrams in strs
        // an array is better, same time complexity, better space complexity

        for (String s: strs){

            Map<Character, Integer> charFrequency = new HashMap<>(); 
            for (int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                charFrequency.put(c, charFrequency.getOrDefault(c,0)+1);
            }
            
            if (map.containsKey(charFrequency)){
                // if key exists, add s to the correponding list
                map.get(charFrequency).add(s);
            } 
            else {
                // else, create a new map entry
                map.put(charFrequency, new ArrayList(List.of(s))); 
                // important, value has to be mutable so we can add new strings to the list later
            }
        }

        // convert map values(List<String>) to a list => List<List<String>> 
        return new ArrayList<>(map.values());
    }
}
