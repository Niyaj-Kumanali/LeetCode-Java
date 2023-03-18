package LeetCode;
//https://leetcode.com/problems/validate-binary-search-tree


public class Validate_Binary_Search_Tree {
    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if (root == null)
            return true;
        if (minNode != null && root.val <= minNode.val)
            return false;
        if (maxNode != null && root.val >= maxNode.val)
            return false;

        return isValidBST(root.left, minNode, root) && isValidBST(root.right, root, maxNode);
    }
}
