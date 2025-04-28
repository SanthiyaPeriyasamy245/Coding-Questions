
class MiddleNode {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;            // move slow by 1 step
            fast = fast.next.next;       // move fast by 2 steps
        }
        
        return slow;
        
    }
}