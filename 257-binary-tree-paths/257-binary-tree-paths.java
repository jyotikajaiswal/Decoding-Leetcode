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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> path = new ArrayList<>();
        binary(root,path,"");
        return path;
    }
    public void binary(TreeNode root, ArrayList<String> path, String s){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            path.add(s + root.val);
            return;
        }
        binary(root.left,path, s + root.val+ "->");
        binary(root.right,path, s +root.val+"->");
    }
}