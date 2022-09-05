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
    
   
    Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodes;
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null)
            return null;
        nodes = new TreeMap<>();
        dfs(root, 0, 0);
        List<List<Integer>> res = new LinkedList<>();
        for (int key : nodes.keySet()){
            List<Integer> list = new LinkedList<>();
            TreeMap<Integer, PriorityQueue<Integer>> temp = nodes.get(key);
            for (int k : temp.keySet()){
                PriorityQueue<Integer> que = temp.get(k);
                while (!que.isEmpty()){
                    list.add(que.poll());
                }
            }
            res.add(list);
        }
        return res;
    }
    
    private void dfs(TreeNode root, int index, int level){
        if (root == null)
            return;
        
        nodes.putIfAbsent(index, new TreeMap<>());
        nodes.get(index).putIfAbsent(level, new PriorityQueue<>());
        nodes.get(index).get(level).add(root.val);
        dfs(root.left, index - 1, level + 1);
        dfs(root.right, index + 1, level + 1);
    }
}