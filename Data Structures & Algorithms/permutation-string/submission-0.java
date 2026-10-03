class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // fixed-size window
        // O(n) time, O(m) space

        int m = s1.length();
        if (m > s2.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>(); // map of s1 chars and their frequencies
        Map<Character, Integer> map2 = new HashMap<>(); // map of current window chars and their frequencies
        for (int i=0; i<m; i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        for (int i=0; i < s2.length()-m; i++) {
            if (map1.equals(map2)) return true;
            // remove the first element
            char out = s2.charAt(i);
            map2.put(out, map2.get(out) - 1);
            if (map2.get(out) == 0) map2.remove(out);
            // add the next element
            map2.put(s2.charAt(i+m), map2.getOrDefault(s2.charAt(i+m), 0) + 1); 
        }

        return map1.equals(map2);        
    }
}
