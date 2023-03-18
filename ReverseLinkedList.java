package LeetCode;
//https://leetcode.com/problems/reverse-linked-list

class ReverseLinkedList {
    public static void main(String[] args) {
        int[] a = {1,2,3};

        ListNode list1 = new ListNode();

        System.out.println(reverseList(list1));
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
