package n_21_merge_two_sorted_lists;

//Merge Two Sorted Lists leetcode.com problem
//https://leetcode.com/problems/merge-two-sorted-lists/

/*
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * */


public class Solution {
    static ListNode one = new ListNode();
    static ListNode two = new ListNode();

    public static void main(String[] args) {
        one = new ListNode(1);
        one.next = new ListNode(2);
        one.next.next = new ListNode(4);

        two = new ListNode(1);
        two.next = new ListNode(3);
        two.next.next = new ListNode(4);

        mergeTwoLists(one, two);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultNode;
        ListNode first;
        ListNode second;

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            first = list1;
            second = list2;
        } else {
            first = list2;
            second = list1;
        }

        resultNode = new ListNode(first.val);

        ListNode pointerTailResultNode = resultNode;
        first = first.next;

        while (true) {
            if (first == null) {
                pointerTailResultNode.next = second;
                return resultNode;
            } else if (second == null) {
                pointerTailResultNode.next = first;
                return resultNode;
            }
            if (first.val <= second.val) {
                pointerTailResultNode.next = new ListNode(first.val);
                pointerTailResultNode = pointerTailResultNode.next;
                first = first.next;
            } else {
                pointerTailResultNode.next = new ListNode(second.val);
                pointerTailResultNode = pointerTailResultNode.next;
                second = second.next;
            }
        }
    }
}
