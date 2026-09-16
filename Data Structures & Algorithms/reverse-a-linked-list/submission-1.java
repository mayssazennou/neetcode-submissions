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
        
        Deque<Integer> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        while ( !stack.isEmpty() ) {
            current.next = new ListNode(stack.pop());
            current = current.next;
        }

        return dummy.next;
    }
}
