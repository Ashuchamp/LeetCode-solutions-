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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current1 = list1;
        ListNode current2 = list2;
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode head = new ListNode();

        if(list1.val > list2.val){
            head.val = list2.val;
            System.out.println(head.val);

            current2 = current2.next;
        }
        else{
            head.val = list1.val;
            System.out.println(head.val);

            current1 = current1.next;
        }
        
        ListNode current = new ListNode();
        current = head;;
        
        while(current1 != null){
            if(current2 != null && current1.val > current2.val){
                current.next = new ListNode(current2.val);
                current2 = current2.next;
                current = current.next;
            }
            else{
                current.next = new ListNode(current1.val);
                current1 = current1.next;
                current = current.next;
            }
        }
        if(current2 != null){
            current.next = current2;
            
        }
       
        return head;
        
        
    }
}