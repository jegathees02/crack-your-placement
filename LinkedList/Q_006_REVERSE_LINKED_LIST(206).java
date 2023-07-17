public /**
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
        ListNode prev = null;
        ListNode temp = head;
        ListNode nextOne = null;
        // prev.next = null;
        while(temp != null) {
            nextOne = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextOne;
        }
        head = prev;
        return head;
    }
} {
    
}
