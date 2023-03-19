package LeetCode;
//https://leetcode.com/problems/reverse-nodes-in-k-group/

public class $ReverseNodesInKGroup {
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
        node4 = reverseKGroup(node, 3);
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null)
            return head;

        ListNode current = head;
        ListNode prev = null;
        while (current != null){

            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;
            boolean flag = true;

            ListNode tmp = current;
            for (int i = 0; i < k-1; i++) {
                if (tmp.next == null){
                    flag = false;
                    break;
                }
                tmp = tmp.next;
            }
            if(!flag)
                break;
            else {
                for (int i = 0; current != null && i < k; i++) {
                    current.next = prev;
                    prev = current;
                    current = next;
                    if (next != null)
                        next = next.next;
                }
            }



            if (last != null)
                last.next = prev;
            else
                head = prev;

            newEnd.next = current;
            prev = newEnd;
        }

        return head;
    }
}
