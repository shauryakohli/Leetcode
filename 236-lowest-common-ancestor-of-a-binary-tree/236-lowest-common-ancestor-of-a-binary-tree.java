/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null ||root==p|| root==q)
        {
            return root;
        }
        TreeNode X=lowestCommonAncestor(root.left,p,q);
        TreeNode Y=lowestCommonAncestor(root.right,p,q);
        if(X==null)
            return Y;
        else if(Y==null)
            return X;
        else
            return root;        
    }
}