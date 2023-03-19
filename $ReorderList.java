package LeetCode;
//https://leetcode.com/problems/reorder-list/

public class $ReorderList {
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
        reorderList(node);
        while (node != null){
            System.out.print(node.val +" --> ");
            node = node.next;
        }
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode firstHead = head;

        while (firstHead != null && secondHead != null){
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }

        if (firstHead != null)
            firstHead.next = null;
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

    public static ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = reverse;
            reverse = head;
            head = next;
        }
        return reverse;
    }
}
