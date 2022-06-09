package intersection_of_two_linked_lists;

//Intersection of Two Linked Lists leetcode.com problem
//https://leetcode.com/problems/intersection-of-two-linked-lists/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

//        [4,1,8,4,5]
//        [5,6,1,8,4,5]

        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(8);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);

        b1.next = b2;
        b2.next = b3;
        b3.next = a3;


        ListNode res = getIntersectionNode(a1, b1);

        System.out.println(res == null ? "null" : res.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode[] allNodesA = allNodesToArray(headA);
        ListNode[] allNodesB = allNodesToArray(headB);

        if (allNodesA[allNodesA.length-1] != allNodesB[allNodesB.length-1]) {
            return null;
        }

        ListNode lastSameNode = null;
        int shortestArrayLength = Math.min(allNodesA.length, allNodesB.length);

        for (int i = 0; i < shortestArrayLength; ++i) {
            if (allNodesA[allNodesA.length-1 - i] == allNodesB[allNodesB.length-1 - i]) {
                lastSameNode = allNodesA[allNodesA.length-1 - i];
            }
        }

        return lastSameNode;
    }

    private static ListNode[] allNodesToArray(ListNode node) {
        ListNode[] array = new ListNode[]{node};

        while (node.next != null) {
            node = node.next;
            array = Arrays.copyOf(array, array.length+1);
            array[array.length-1] = node;
        }
        return array;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
