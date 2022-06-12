class MinStack {
    
    ListNode head;
    int min;
    boolean init = false;
    
    public MinStack() {
        head =  new ListNode();
    }
    
    public void push(int val) {
        if(init){
            ListNode temp = new ListNode(val);
            temp.next = head;
            head = temp;
            if(min > val){
                min = val;
            }
        }
        else{
            ListNode temp = new ListNode(val);
            head = temp;
            min = val;
            init = true;
        }
    }
    
    public void pop() {
        head = head.next;
        ListNode temp = head;
        if(temp != null){
            min = head.val;
        }
        if(temp == null){
            init = false;
        }
        while(temp != null){
            if(temp.val < min){
                min = temp.val;
            }
            temp = temp.next;
        }
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return min;
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