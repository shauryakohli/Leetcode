class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int sum=(n*(n+1))/2;
       int total=0;
       int result=0;
       for(int i=0;i<n;i++)
       {
           total=total+nums[i];
       }
       result=sum-total;
       return result;
        
        
    }
}