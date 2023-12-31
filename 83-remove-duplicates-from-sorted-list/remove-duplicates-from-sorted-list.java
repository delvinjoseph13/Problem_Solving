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
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode current=head;
         
        //  while(current!=null && current.next!=null){
        //      if(current.val==current.next.val){
        //          current.next=current.next.next;

        //      }else{
        //          current=current.next;
        //      }
        //  }
        //  return head;

        ListNode dummy=new ListNode(0);
        ListNode current=head;
        ListNode newCurrent=dummy;

        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else{
                newCurrent.next=current;
                newCurrent=newCurrent.next;
                current=newCurrent.next;
            }
        }
        newCurrent.next=current;

        return dummy.next;
    }
}