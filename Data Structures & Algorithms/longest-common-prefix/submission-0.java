class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder prefix = new StringBuilder("");
        
        int n = Integer.MAX_VALUE; // min length of strings in strs
        for (String s: strs){
            n = Math.min(n, s.length());
        }

        for (int i=0; i<n; i++){
            for (String s: strs){
                if (s.charAt(i) != strs[0].charAt(i)){
                    return prefix.toString();
                }
            }
            // i is prefix length
            prefix.append(strs[0].charAt(i));
        }
        return prefix.toString();
       
    }
}