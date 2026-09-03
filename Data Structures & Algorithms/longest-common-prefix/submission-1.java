class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // Handle edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder prefix = new StringBuilder("");

        // the prefix's length is at most the shortest string's length
        int n = Integer.MAX_VALUE;
        for (String s: strs){
            n = Math.min(n, s.length());
        }

        if (n==0) return "";

        // iterate n times through the array's strings to find the first common chars
        for (int i=0; i<n; i++){
            char nextPossibleChar = strs[0].charAt(i);
            for (String s: strs){
                if (s.charAt(i) != nextPossibleChar){
                    return prefix.toString();
                }
            }
            prefix.append(nextPossibleChar);
        }
        return prefix.toString();
    }
}