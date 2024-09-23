
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        if(position <= 1) {
            ListNode addNode = new ListNode(val);
            addNode.next = head;
            return addNode;
        }

        if(head == null) return new ListNode(val);

        ListNode beforeInsert = head;

        for(int i = 0; i < position - 2; i++) {
            if(beforeInsert.next == null) break;
            beforeInsert = beforeInsert.next;
        }

        ListNode afterInsert = beforeInsert.next;

        beforeInsert.next = new ListNode(val);
        beforeInsert.next.next = afterInsert;

        return head;
    }
}
