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
    int res;  
    public int diameterOfBinaryTree(TreeNode root) {
           res=Integer.MIN_VALUE;
           height(root);
           
           return res-1;
       }
         public int height(TreeNode node)
       {
         if(node==null)
         {
             return 0;
         }
           int l=height(node.left);
           int r=height(node.right);
           
           res=Math.max(res,1+l+r);
           
           return 1+Math.max(l,r);
          
      }
 
           
}