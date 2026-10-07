class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        Map<Character, Integer> bag1 = new HashMap<>();
        Map<Character, Integer> bag2 = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            bag1.put(c, bag1.getOrDefault(c, 0) + 1);
            c = t.charAt(i);
            bag2.put(c, bag2.getOrDefault(c, 0) + 1);
        }

        return bag1.equals(bag2);
    }
}
