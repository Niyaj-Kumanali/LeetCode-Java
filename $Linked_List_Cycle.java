package LeetCode;
//https://leetcode.com/problems/linked-list-cycle/

public class $Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-4);
        ListNode node2 = new ListNode(0, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(3, node3);
        node1.next = node3;
//        while (node4 != null){
//            System.out.print(node4.val +" --> ");
//            node4 = node4.next;
//        }
//        Amazon and Microsoft
        {
            System.out.println(hasCycle(node4));
            System.out.println(lengthOfCycle(node4));
        }

    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static int lengthOfCycle(ListNode head) {
        ListNode slow  = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                ListNode node = slow;
                int length = 0;
                do{
                    node = node.next;
                    length++;
                }while(node != slow);
                return length;
            }
        }
        return 0;
    }
}
