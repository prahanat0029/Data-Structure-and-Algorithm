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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return solve(root,targetSum);
    }
    boolean solve(TreeNode root, int targetSum){
        if(root==null)return false;
        if(root.left==null && root.right==null){
            if(targetSum-root.val==0)return true;
            return false;
        }
        boolean left=false,right=false;
            left= solve(root.left,targetSum-root.val);

            right= solve(root.right,targetSum-root.val);

        
        return left||right;
    }
}