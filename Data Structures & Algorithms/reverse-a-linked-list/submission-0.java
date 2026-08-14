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
    public ListNode reverseList(ListNode head) {
        ListNode oldHead = head;
         
        if(head == null){
            return null;
        }
        while(head.next!=null){
            ListNode temp = head;
            head =head.next; 
            head.next = temp;
        }
        return head;
    }
}
