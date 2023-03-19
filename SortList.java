package LeetCode;
//https://leetcode.com/problems/sort-list

public class SortList {
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
        ListNode ans = sortList(node);
        while (ans != null ){
            System.out.print(ans.val +" --> ");
            ans = ans.next;
        }


    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public static ListNode merge(ListNode list1, ListNode list2){
        ListNode node = new ListNode();
        ListNode tail = node;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return node.next;
    }

    public static ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next !=null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
