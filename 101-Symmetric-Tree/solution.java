/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode q, TreeNode p){
        if(q==null && p==null)
            return true;
        if(q==null || p==null)
            return false;
        if(q.val != p.val)
            return false;
        return isMirror(q.left,p.right) && isMirror(q.right, p.left);
    }
}