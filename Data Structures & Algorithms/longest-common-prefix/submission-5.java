class Solution {
    public String longestCommonPrefix(String[] strs) {

        // 1) Eliminate the Shortest String Pass
        // Benefit: Removes the separate pass to find minimum length, saving O(n) time.

        // 2) Avoid StringBuilder (Use String.substring)
        // Benefit: More readable and eliminates the StringBuilder object.


        // vertical scanning
        for (int i=0; i<strs[0].length(); i++){
            for (int j=1; j<strs.length; j++){
                if ( i>=strs[j].length() || strs[j].charAt(i)!=strs[0].charAt(i) ){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}