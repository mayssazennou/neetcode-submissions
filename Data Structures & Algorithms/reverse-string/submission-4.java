class Solution {
    public void reverseString(char[] s) {
        
        // stack
        // O(n) time, O(n) space

        Deque<Character> stack = new ArrayDeque<>();

        for (int i=0; i<s.length; i++) {
            stack.push(s[i]);
        }

        for (int i=0; i<s.length; i++) {
            s[i] = stack.pop();
        }
    }
}