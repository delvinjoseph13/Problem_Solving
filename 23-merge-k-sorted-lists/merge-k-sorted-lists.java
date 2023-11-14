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
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         if(lists.length==0 || lists==null) return null;

//         ListNode head=new ListNode(0);
//         ListNode temp=head;

//         List<Integer> l =new ArrayList<>();
//         for(ListNode list:lists){
//             while(list!=null){
//                 l.add(list.val);
//                 list=list.next;

//             }
//         }
//         Collections.sort(l);
//         for(int val:l){
//             temp.next=new ListNode(val);
//             temp=temp.next;
//         }
//         return head.next;
        
//     }
// }



class Solution{
    public ListNode mergeKLists(ListNode[] lists){
           
            return mergeSort(lists,0,lists.length-1);
    }

     private ListNode mergeSort(ListNode[] lists,int left,int right){
         if(left==right) return lists[left];

         if(left<right){
             int mid=(left+right)/2;

             ListNode ll=mergeSort(lists,left,mid);

             ListNode lr=mergeSort(lists,mid+1,right);

             return merge(ll,lr);
         }
         else return null;

     }

     private ListNode merge(ListNode l1,ListNode l2){
          
          if(l1==null) return l2;
          if(l2==null) return l1;

          if(l1.val< l2.val){
              l1.next=merge(l1.next,l2);
              return l1;
          }else{
              l2.next=merge(l1,l2.next);
              return l2;
          }

     }

}


