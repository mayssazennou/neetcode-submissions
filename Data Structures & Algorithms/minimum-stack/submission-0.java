class MinStack {

    // brute force
    // O(n) time

    private Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        
        // int min = Integer.MAX_VALUE;
        // for (int num: stack) {
        //     if (num<min) min = num;
        // }
        // return min;

        return stack.stream().mapToInt(Integer::intValue).min().orElse(0);
    }
}
