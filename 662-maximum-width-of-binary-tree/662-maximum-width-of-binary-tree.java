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
    public int widthOfBinaryTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<TreeNode,Integer> map = new HashMap<>();
        q.add(root);
        map.put(root,1);
        int res = 0;
        while(q.isEmpty()!=true){
            int size = q.size();
            int start=0;
            int end=0;
            for(int i=0; i<size; i++){
                TreeNode temp = q.remove();
                if(i==0)start=map.get(temp);
                if(i==size-1)end=map.get(temp);
                
                if(temp.left!=null){
                    q.add(temp.left);
                    map.put(temp.left,map.get(temp)*2);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                    map.put(temp.right,map.get(temp)*2+1);
                }
            }
            res = Math.max(res,end-start+1);
        }
        return res;
    }
}