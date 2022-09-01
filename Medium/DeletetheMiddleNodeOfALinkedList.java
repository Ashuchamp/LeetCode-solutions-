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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode mid = head;
        ListNode end = head.next.next;
        while(end != null && end.next != null){
            end = end.next.next;
            mid = mid.next;
        }
        mid.next = mid.next.next;
        return head;
    }
}