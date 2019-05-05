package PalindromeLinkedList_234;

/**
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class PalindromeLinkedList {


    public static boolean isPalindrome(ListNode head) {

        ListNode source = head;
        ListNode reverse = null;
        while (head != null) {
            ListNode listNode = new ListNode(head.val);
            listNode.next = reverse;
            reverse = listNode;
            head = head.next;
        }

        while (source != null && reverse != null) {

            if (source.val != reverse.val) {
                return false;
            }
            source = source.next;
            reverse = reverse.next;
        }

        return true;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
