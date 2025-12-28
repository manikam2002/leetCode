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
      ListNode mt_node =new ListNode(0);
      ListNode new_node = mt_node;
       ListNode l1 = list1;
        ListNode l2 = list2;


      while(l1 !=null && l2 != null){
        if(l1.val <= l2.val){
            new_node.next=l1;
            l1 = l1.next;
            }
            else{
                new_node.next=l2;
                l2 =l2.next;
            }
            new_node =new_node.next;
      }
      if(l1 !=null){
        new_node.next=l1;
        
      }
      if(l2 !=null){
        new_node.next=l2;
         
      }
      return mt_node.next;
    

        
       
    }
}