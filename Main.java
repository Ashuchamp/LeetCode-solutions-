import java.util.*;
import java.util.Enumeration;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] temp = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(temp));
  }

 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current1 = list1;
        ListNode current2 = list2;
        
        if(list1.val > list2.val){
            head.val = list2.val;
            current2 = current2.next;
        }
        else{
            head.val = list1.val;
            current1 = current1.next;
        }
        
        ListNode current = new ListNode();
        head.next = current;
        
        while(current1 != null){
            if(current2 != null && current1.val > current2.val){
                current.val = current2.val;
                current2 = current2.next;
                current.next = new ListNode();
                current = current.next;
                System.out.println("current2");
            }
            else{
                current.val = current1.val;
                current1 = current1.next;
                current.next = new ListNode();
                current = current.next;
                System.out.println("current1");
            }
        }
        if(current2 != null){
            current = current2;
        }
        return head;
        
        
    }
}