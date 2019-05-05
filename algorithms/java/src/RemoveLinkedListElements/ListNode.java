package RemoveLinkedListElements;

public class ListNode {


    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


    public ListNode(int[] arr) {

        this.val = arr[0];
        ListNode cur = this;

        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }


    @Override
    public String toString() {


        StringBuilder stringBuilder = new StringBuilder("ListNode head ");
        ListNode cur = this;
        while (cur != null) {
            stringBuilder.append(cur.val + "->");
            cur = cur.next;
        }
        stringBuilder.append("NULL");
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        ListNode listNode = new ListNode(arr);
        System.out.println(listNode);
//        ListNode afterListNode2 = RemoveLinkedListElements.removeElements2(listNode, 6);
        ListNode afterListNode3 = RemoveLinkedListElements.removeElements3(listNode, 6);
        System.out.println(afterListNode3);
    }
}
