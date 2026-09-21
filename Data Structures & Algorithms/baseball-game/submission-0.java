class Solution {
    public int calPoints(String[] operations) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;

        for (String op: operations) {

            if (op.equals("+")) {
                int prev = stack.pop();
                int newScore = prev + stack.peek();
                stack.push(prev);
                stack.push(newScore);
                sum += newScore;
            } 
            else if (op.equals("D")) {
                int doubled = 2 * stack.peek();
                stack.push(doubled);
                sum += doubled;
            } 
            else if (op.equals("C")) {
                sum -= stack.pop();
            } 
            else {
                // It's a number
                int num = Integer.parseInt(op);
                stack.push(num);
                sum += num;
            }
            // how to handle edge cases? if operations starts with '+', 'D' or 'C' or has invalid combinations
        }

        return sum;
    }
}