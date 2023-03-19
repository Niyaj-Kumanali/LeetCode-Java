package LeetCode;
//https://leetcode.com/problems/linked-list-cycle-ii

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-4);
        ListNode node2 = new ListNode(0, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(3, node3);
        node1.next = node3;

        System.out.println(detectCycle(node4).val);
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second) {
                first = head;
                while (first != second) {
                    first = first.next;
                    second = second.next;
                }
                return first;
            }
        }

        return null;
    }
}
