package remove_duplicates_from_sorted_list;

//83. Remove Duplicates from Sorted List leetcode.com problem
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class Solution {
    public static void main(String[] args) {

        //    1,1,2,3,3
        ListNode node = fillNodes();
        System.out.println(deleteDuplicates(node));

        ListNode nodeToPrint = node;

        while (nodeToPrint != null) {
            System.out.println(nodeToPrint.val);

            nodeToPrint = nodeToPrint.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode currentNode = head;

        while (currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    private static ListNode fillNodes() {
        return new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(3)))));
    }
}
