package LeetCode;
//https://leetcode.com/problems/linked-list-cycle-ii

public class LinkedListCycleII {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        ListNode list1 = new ListNode();

        System.out.println(detectCycle(list1));
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode start = head;
        ListNode end = head;

        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
            if (start == end) {
                start = head;
                while (start != end) {
                    start = start.next;
                    end = end.next;
                }
                return start;
            }
        }

        return null;
    }
}
