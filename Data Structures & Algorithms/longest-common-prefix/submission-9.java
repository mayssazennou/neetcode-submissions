class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Sort; LCP of all strings == LCP of first & last after sorting
        // Time:  O(k * n * log n)   (n log n comparisons, each O(k) char compares)
        // Space: O(n)               (TimSort auxiliary array)
        // only optimal in very niche cases

        if (strs.length == 1) return strs[0];

        Arrays.sort(strs);

        int n = strs.length;
        int minLen = Math.min(strs[0].length(), strs[n-1].length());
        for (int i=0; i<minLen; i++) {
            if (strs[0].charAt(i) != strs[n-1].charAt(i)) {
                return strs[0].substring(0, i);
            }
        }

        return strs[0];
    }
}