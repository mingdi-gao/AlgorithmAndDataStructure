package LeetCode.MergeTwoSortedList_21;

import LeetCode.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode1 = new ListNode(0);
        ListNode dummyNode2 = new ListNode(0);
        dummyNode1.next = l1;
        dummyNode2.next = l2;

        ListNode head1 = dummyNode1.next;
        ListNode head2 = dummyNode2.next;

        ListNode mergedList = new ListNode(0);
        ListNode head = mergedList;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                head.next = head1;
                head1 = head1.next;
            } else {
                head.next = head2;
                head2 = head2.next;
            }
            head = head.next;
        }
        if (head1 != null) {
            head.next = head1;
        } else {
            head.next = head2;
        }

        return mergedList.next;
    }
}
