/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode current = head;
        while(current != null){
            stack.push(current.val);
            current = current.next;
        }
        
        while(head != null){
            int i = stack.pop();
            if(i != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}