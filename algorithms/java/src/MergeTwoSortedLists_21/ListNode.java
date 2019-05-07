package MergeTwoSortedLists_21;

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("Head top " + val);
        ListNode tail = this.next;
        while (tail != null) {
            stringBuilder.append("==>" + tail.val);
            tail = tail.next;
        }
        return stringBuilder.toString();
    }
}
