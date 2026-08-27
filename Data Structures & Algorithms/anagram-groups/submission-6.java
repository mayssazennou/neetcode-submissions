class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>(); 
        // maps a sorted string with the list of its anagrams present in strs

        for (String s: strs){
            // sortedS = sort s
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);

            if (map.containsKey(sortedS)){
                // if key exists, add s to the correponding list
                map.get(sortedS).add(s);
            } 
            else {
                // else, create a new map entry
                map.put(sortedS, new ArrayList(List.of(s))); 
                // important, value has to be mutable so we can add new strings to the list later
            }
        }

        // convert map values(List<String>) to a list => List<List<String>> 
        return new ArrayList<>(map.values());
    }
}
