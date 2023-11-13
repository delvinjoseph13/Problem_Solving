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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode();
        start.next=head;
        ListNode fast=start;
        ListNode slow=start;
        
        // Move the fast pointer n+1 steps ahead
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }

         // Move both pointers until the fast pointer reaches the end
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        // Remove the nth node from the end by adjusting the pointers
        slow.next=slow.next.next;
        
        // Return the updated head
        return start.next;
    }
}