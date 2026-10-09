class Solution {
    public String longestCommonPrefix(String[] strs) {

        // brute force 
        // O(n*k) time (n=strs.length, k=length of the shortest string), O(k) space

        if (strs.length == 1) return strs[0];

        int minLen = Integer.MAX_VALUE;
        for (String s: strs) {
            minLen = Math.min(minLen, s.length());
        }
        if (minLen == 0) return "";

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j=1; j<strs.length; j++) {
                if (strs[j].charAt(i)!=c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}