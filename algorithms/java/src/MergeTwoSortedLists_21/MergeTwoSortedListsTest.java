package MergeTwoSortedLists_21;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {


        int[] a = {1, 2, 4};
        int[] b = {1, 3, 4};

        ListNode l1 = arrToListNode(a);
        ListNode l2 = arrToListNode(b);


        ListNode listNode = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        System.out.println(listNode);
    }

    private ListNode arrToListNode(int[] a) {

        ListNode dummyNode = new ListNode(-1);
        ListNode tail = dummyNode;
        for (int i = 0; i < a.length; i++) {
            tail.next = new ListNode(a[i]);
            tail = tail.next;
        }

        return dummyNode.next;
    }
}