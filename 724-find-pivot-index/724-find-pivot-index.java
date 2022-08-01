class Solution {
    public int pivotIndex(int[] nums) {
       int tsum=0;
        for(int i=0;i<nums.length;i++)
        {
           tsum=tsum+nums[i];
        }
        int lsum=0;
        for(int i=0;i<nums.length;i++)
        {
          
               if(i!=0) 
                   lsum=lsum+nums[i-1];
            if(tsum-lsum-nums[i]==lsum)
            {
                return i;
            }
        }
        return -1;
    }
}