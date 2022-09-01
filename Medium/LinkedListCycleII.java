/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        if(head == null){
            return null;
        }
        ListNode current = head;
        
        while(current.next != null){
            if(set.contains(current)){
                return current;
            }
            set.add(current);
            current = current.next;
            
        }
        return null;
    }
}