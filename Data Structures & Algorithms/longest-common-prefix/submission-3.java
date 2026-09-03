class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Eliminate the Shortest String Pass
        // Benefit: Removes the separate pass to find minimum length, saving O(n) time.

        StringBuilder prefix = new StringBuilder("");

        // iterate through characters of the first string 
        for (int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);
            // check c against all other strings 
            for (int j=1; j<strs.length; j++){
                if ( i>=strs[j].length() || strs[j].charAt(i)!=c ){
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }

        return prefix.toString();
    }
}