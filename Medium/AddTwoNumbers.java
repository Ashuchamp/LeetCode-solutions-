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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode current = head;
        int carry = 0;
        
        while(current1 != null || current2 != null){
            int x = 0;
            if(current1 != null){
                x = current1.val;
            }
            int y = 0;
            if(current2 != null){
                y = current2.val;
            }
            
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if(current1 != null){
                current1 = current1.next;
            }
            if(current2 != null){
                current2 = current2.next;
            }
        }
        
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return head.next;
    }
}