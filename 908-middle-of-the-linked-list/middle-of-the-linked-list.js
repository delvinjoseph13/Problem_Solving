/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
 function countNode(head){
      let count=0;
      let i=head;
      while(i!=null){
        count++;
        i=i.next;
      }
      return count;
 }
var middleNode = function(head) {
   let length=countNode(head)
    let jumps=0;
    let i=head;

    while(jumps<Math.floor(length/2)){
        i=i.next;
        jumps++;
    }
   return i;
};