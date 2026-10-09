class Solution {
    public String longestCommonPrefix(String[] strs) {

        // vertical scanning (no StringBuilder + no shortest string pass)
        // O(n*k) time (n=strs.length, k=length of the shortest string), O(1) space

        for (int i=0; i<strs[0].length(); i++) {
            for (int j=1; j<strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}