package LeetCode;
//https://leetcode.com/problems/reverse-linked-list-ii

public class $ReverseLinkedListII {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-4);
        ListNode node2 = new ListNode(0, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node = new ListNode(3, node3);
        ListNode node4 = node;
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }
        System.out.println();
        node4 = reverseBetween(node, 2,3);
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;

        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1
                ; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null)
                next = next.next;
        }

        if (last != null)
            last.next = prev;
        else
            head = prev;

        newEnd.next = current;
        return head;
    }
}
