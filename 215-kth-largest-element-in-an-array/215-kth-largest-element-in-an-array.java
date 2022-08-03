class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer>heap=new PriorityQueue<>();
        int n=nums.length;
       for(int i=0;i<n;i++)
       {
           heap.add(nums[i]);
       }
       while(n>k)
       {
           heap.remove();
           n--;
       }
      return heap.peek();
    }
}