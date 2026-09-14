class Solution {
    public void reverseString(char[] s) {

        // recursive approach
        
        helper(s, 0, s.length-1);
    }

    private void helper(char[] s, int start, int end) { 
        // start, end included
    
        if ( start >= end ) return;

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        helper(s, start+1, end-1);
    }
}