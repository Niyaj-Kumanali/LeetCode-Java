package LeetCode;
//https://leetcode.com/problems/reverse-linked-list

class $ReverseLinkedList {
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
        node4 = reverseList(node);
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }

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

//    public static ListNode reverseList2(ListNode head) {
//        if (head == null)
//            return head;
//
//        ListNode prev = null;
//        ListNode present = head;
//        ListNode next = present.next;
//
//        while (present != null){
//            present.next = prev;
//            prev = present;
//            present = next;
//            if (next != null)
//                next = next.next;
//        }
//        return prev;
//    }
}
