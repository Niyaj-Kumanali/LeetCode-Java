package LeetCode;
//https://leetcode.com/problems/palindrome-linked-list

public class $PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0, node1);
        ListNode node3 = new ListNode(0, node2);
        ListNode node = new ListNode(2, node3);
        ListNode node4 = node;
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }
        System.out.println();
        System.out.println(isPalindrome(node));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereversedHead = headSecond;

        while (head != null && headSecond != null){
            if (head.val != headSecond.val)
                break;
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(rereversedHead);

        return head == null || headSecond == null;
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
