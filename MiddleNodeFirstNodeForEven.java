class MiddleNodeFirstNodeForEven {
    int getMiddleElementOfLinkedList(ListNode list) {
        if (list == null) return -1; // or handle empty case properly
        
        ListNode slow = list;
        ListNode fast = list;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }
}
