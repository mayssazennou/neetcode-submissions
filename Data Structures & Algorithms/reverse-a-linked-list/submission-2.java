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
        
        ListNode current = head;
        ListNode prev = null;
        ListNode nextNode;

        while (current != null) {
            nextNode = current.next;  // save what's ahead before we overwrite
            current.next = prev;      // flip this node's pointer backward
            prev = current;           // advance prev
            current = nextNode;       // advance current
        }
        return prev;
    }
}
