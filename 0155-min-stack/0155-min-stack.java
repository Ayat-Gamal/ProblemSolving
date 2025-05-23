class MinStack {

   private Stack<Integer> stack;
   private Stack<Integer> minStack; // to keep track the min value *even it pop up from the stack* thats why tack min with simple integer value will not work

    public MinStack() {
         stack = new Stack<>();
         minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek()){
             minStack.push(val);
        }
    
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int poped = stack.pop();     
            if(poped == minStack.peek())  
            {
                minStack.pop();
            }
        }
    }
    
    public int top() {
         if(!stack.isEmpty()){
            return stack.peek();
        }else {
           throw new RuntimeException("Stack is empty");
        }
     }
    
    public int getMin() {
        if(!minStack.isEmpty()){
           return minStack.peek();
        }else {
            throw new RuntimeException("Stack is empty");
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */