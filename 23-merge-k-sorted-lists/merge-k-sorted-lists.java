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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i<lists.length; i++){
            ListNode current = lists[i];
            while (current != null) {
                minHeap.add(current.val);
                current = current.next;
            }
        }
        ListNode head = new ListNode(0);
        ListNode node = head;

        while(!minHeap.isEmpty()){
            node.next = new ListNode(minHeap.poll());
            node = node.next;
        }
        return head.next;
    }
}