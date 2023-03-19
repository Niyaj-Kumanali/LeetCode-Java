package LeetCode;
//https://leetcode.com/problems/rotate-list/

public class RotateList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-4);
        ListNode node2 = new ListNode(0, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node5 = new ListNode(3, node3);
        ListNode node = new ListNode(5, node5);

//        ListNode node1 = new ListNode(-4);
//        ListNode node = new ListNode(5, node1);



        ListNode node4 = node;
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }
        System.out.println();
        node4 = rotateRight(node, 2);
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null)
            return head;
        ListNode tail = head;
        int length = 1;
        while (tail.next != null){
            tail = tail.next;
            length++;
        }

        tail.next = head;
        int rotations =length - k % length;
        ListNode newtail = head;
        for (int i = 0; i < rotations - 1; i++){
            newtail = newtail.next;
        }
        head = newtail.next;
        newtail.next = null;

        return head;

    }

//    public static ListNode rotateRight(ListNode head, int k) {
//        if (head == null || head.next == null)
//            return head;
//        for (int i = 0; i < k; i++){
//            ListNode tail = head.next;
//            ListNode prev = head;
//            while (tail.next != null){
//                prev = tail;
//                tail = tail.next;
//            }
//
//            tail.next = head;
//            head = tail;
//            prev.next = null;
//        }
//
//        return head;
//
//    }
}
