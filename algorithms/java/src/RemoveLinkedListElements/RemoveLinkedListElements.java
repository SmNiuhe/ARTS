package RemoveLinkedListElements;

/**
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val)
            head = head.next;


        if (head == null)
            return head;

        ListNode pre = head;
        while (pre.next != null) {

            if (pre.next.val == val)
                pre.next = pre.next.next;
            else
                pre = pre.next;
        }

        return head;
    }


    public static ListNode removeElements2(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode pre = dummyHead;
        while (pre.next != null) {

            if (pre.next.val == val)
                pre.next = pre.next.next;
            else
                pre = pre.next;
        }

        return dummyHead.next;
    }


    public static ListNode removeElements3(ListNode head, int val) {

        if (head == null)
            return null;

        head.next = removeElements3(head.next, val);
        return head.val == val ? head.next : head;
    }

}
