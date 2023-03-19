package LeetCode;
//https://leetcode.com/problems/merge-two-sorted-lists


import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] a = {1,2,4};
        int[] b = {1,3,4};

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode ans = mergeTwoLists(list1, list2);
        while (ans != null){
            System.out.print(ans.val +" --> ");
            ans = ans.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
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

//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null)
//            return list2;
//        else if (list2 == null)
//            return list1;
//
//        ListNode mergedHead = null;
//        if (list1.val <= list2.val)
//        {
//            mergedHead = list1;
//            list1 = list1.next;
//        }
//        else
//        {
//            mergedHead = list2;
//            list2 = list2.next;
//        }
//
//        ListNode mergedTail = mergedHead;
//
//        while (list1 != null && list2 != null)
//        {
//            ListNode temp = null;
//            if (list1.val <= list2.val)
//            {
//                temp = list1;
//                list1 = list1.next;
//            }
//            else
//            {
//                temp = list2;
//                list2 = list2.next;
//            }
//
//            mergedTail.next = temp;
//            mergedTail = temp;
//        }
//
//        if (list1 != null)
//            mergedTail.next = list1;
//        else if (list2 != null)
//            mergedTail.next = list2;
//
//        return mergedHead;
//    }
}
