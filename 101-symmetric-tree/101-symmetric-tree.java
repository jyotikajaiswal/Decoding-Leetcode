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
    public boolean isSymmetric(TreeNode root) {
        return equals(root.left,root.right);
    }
    public boolean equals(TreeNode leftn, TreeNode rightn){
        if(leftn == null && rightn ==null)
            return true;
        else if(leftn == null || rightn ==null)
            return false;
        boolean leftside = equals(leftn.left,rightn.right);
        boolean rightside = equals(leftn.right,rightn.left);
        return ((leftn.val == rightn.val) && leftside && rightside);
    }
}