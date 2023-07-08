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
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int n = 0;
        while(cur != null) {
            n++;
            cur = cur.next;
        }
        n = n/2;
        int cnt = 0;
        ListNode node = head;
        while(node != null) {
            cnt++;
            node = node.next;
            if(cnt == n) return node;
        }
        return head;
    }
    
}