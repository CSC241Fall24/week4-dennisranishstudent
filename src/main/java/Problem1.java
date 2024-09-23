// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), end = head;
        head.next = l1;

        while(end.next != null) end = end.next;

        for(ListNode a = l2; a != null; a = a.next) {
            end = end.next = new ListNode(a.val);
        }
        
        return head.next;
    }
}