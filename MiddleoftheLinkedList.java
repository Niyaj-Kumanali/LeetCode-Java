package LeetCode;
//https://leetcode.com/problems/middle-of-the-linked-list

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        int[] a = {1,2,3};

        ListNode list1 = new ListNode();

        System.out.println(middleNode(list1));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
        }
        return start;
    }
}
