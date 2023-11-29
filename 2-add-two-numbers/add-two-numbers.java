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
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int val1=(l1!=null) ? l1.val : 0 ;
            int val2=(l2!=null) ? l2.val : 0 ;

            int totalsum=val1+val2+carry;
            carry=totalsum/10;
            int digit=totalsum%10;

            current.next=new ListNode(digit);
            current=current.next;

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return dummy.next;
    }
}
    