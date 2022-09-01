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
    public int goodNodes(TreeNode root) {
        
        if(root == null) return 0;
        return count(root, root.val);
    }
    
    private int count(TreeNode node, int max){
        
        if(node == null) return 0; 
        
        max = Math.max(node.val, max); // max node value in current path
        int left = count(node.left, max); // count all good nodes in left
        int right = count(node.right, max); // count all good nodes in right
        
        int res = left + right;
        if(node.val >= max) res++; // if current node is good, add that in res
        
        return res;
    }
}