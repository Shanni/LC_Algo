/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head, prev=curr;
        if(head==null)
            return null;
        while(curr.next!=null){
            prev=dummy.next;
            dummy.next=curr.next;
            curr.next=curr.next.next;
            dummy.next.next=prev;
        }
        return dummy.next;
    }
}