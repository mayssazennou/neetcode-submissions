class Solution {
    public int calPoints(String[] operations) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String op: operations) {
            if (op.equals("+")) {
                int prev = stack.pop();
                int newScore = prev + stack.peek();
                stack.push(prev);
                stack.push(newScore);
            }
            else if (op.equals("D")) {
                stack.push(2*stack.peek());
            }
            else if (op.equals("C")) {
                stack.pop();
            }
            else {
                // op is an Integer
                stack.push(Integer.parseInt(op));
            }
        }
        
        // int sum = 0;
        // for (int score: stack) {
        //     sum += score;
        // }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}