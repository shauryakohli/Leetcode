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
    public int pseudoPalindromicPaths (TreeNode root) {
        return parsePalinTree(root, new int[10]);
    }
    
    public int parsePalinTree(TreeNode root, int[] arr){
        
        int count = 0; 
        arr[root.val]++;
        //Base Case: Reach a leaf node
        if(root.left == null && root.right == null){
            boolean isValidPath = isPalinDromePath(arr);
            if(isValidPath) count = 1;
        }
        // Left and right subtree: 
        if(root.left != null) count += parsePalinTree(root.left, arr);
        if(root.right != null) count += parsePalinTree(root.right, arr);
            
        arr[root.val]--; 
        return count; 
    }
    
    public boolean isPalinDromePath(int[] arr){
        boolean firstOdd = true;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if(arr[i] % 2 == 1){
                if(!firstOdd) return false;
                firstOdd = false;
            }
        }
        return true;
    }
}