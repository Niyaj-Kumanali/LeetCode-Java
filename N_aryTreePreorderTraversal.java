package LeetCode;
//https://leetcode.com/problems/n-ary-tree-preorder-traversal/

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class N_aryTreePreorderTraversal {
    public static void main(String[] args) {
//        int[] root = {1,null,3,2,4,null,5,6};
//        System.out.println(preorder(root));
    }
//    below answer is copy pasted
    public static List<Integer> preorder(Node root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            ans.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; --i)
                stack.push(root.children.get(i));
        }

        return ans;
    }
}
