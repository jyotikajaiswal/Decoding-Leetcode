/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean status = true;
    public int height(TreeNode root){
        if(root == null)
            return 0;
        int lefth = height(root.left)+1;
        int righth = height(root.right)+1;
        int a = Math.abs(lefth-righth);
        if(a>1)
            status = false;
        return Math.max(lefth,righth);
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        return status;
    }
}