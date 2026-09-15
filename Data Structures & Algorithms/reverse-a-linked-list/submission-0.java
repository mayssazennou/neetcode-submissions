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
        
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        Collections.reverse(values);

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (Integer val: values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;

    }
}
