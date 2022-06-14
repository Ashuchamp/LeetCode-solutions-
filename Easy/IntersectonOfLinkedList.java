/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> list = new ArrayList();
        ListNode current = headA;
        while(current != null){
            list.add(current);
            current = current.next;
        }
        current = headB;
        while(current != null){
            if(list.contains(current)){
                return current;
            }
            current = current.next;
        }
        return null;
    }
}