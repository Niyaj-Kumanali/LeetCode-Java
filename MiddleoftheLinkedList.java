package LeetCode;
//https://leetcode.com/problems/middle-of-the-linked-list

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        int[] a = {1,2,3};

        ListNode list1 = new ListNode();

        System.out.println(middleNode(list1));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
