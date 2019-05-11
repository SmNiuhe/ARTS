package MergeTwoSortedLists_21;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoSortedLists {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {

                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            } else {

                tail.next = l1;
                l1 = l1.next;
                tail = tail.next;
            }
        }

        if (l1 == null) {
            tail.next = l2;
        } else {
            tail.next = l1;
        }

        return dummyHead.next;
    }


}
