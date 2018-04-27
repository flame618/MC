/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while(head != null)
        {
            ListNode headNext = head.next;
            head.next = pre;
            pre = head;
            head = headNext;
        }
        return pre;
    }
}
