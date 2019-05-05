package PalindromeLinkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {


    @Test
    public void isPalindrome() {

        PalindromeLinkedList.ListNode listNode = new PalindromeLinkedList.ListNode(1);
        listNode.next = new PalindromeLinkedList.ListNode(2);
        Assert.assertTrue(PalindromeLinkedList.isPalindrome(listNode));
    }


}