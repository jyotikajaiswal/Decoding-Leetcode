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
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        TreeInfo ans = diams(root);
        return ans.diam;
    }
    public TreeInfo diams(TreeNode root){
        if(root == null)
            return new TreeInfo(0,0);
        TreeInfo left = diams(root.left);
        TreeInfo right = diams(root.right);
        int height = Math.max(left.ht,right.ht)+1;
        int diam1= left.diam;
        int diam2= right.diam;
        int diam3 = left.ht+right.ht;
        int finaldiam = Math.max(diam3,Math.max(diam1,diam2));
        return new TreeInfo(height,finaldiam);
    }
}