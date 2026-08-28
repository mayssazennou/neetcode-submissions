class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        int[] arrayS = new int[26];
        int[] arrayT = new int[26];

        for (int i=0; i<s.length(); i++){
            arrayS[s.charAt(i)-'a']++;
            arrayT[t.charAt(i)-'a']++;
        }

        return Arrays.equals(arrayS, arrayT);
    }
}
