class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int i=n-1;
        int j=i-1;
        while(j>=0)
        {
            if(nums[j]>=i-j)
            {
                i=j;
            }
            j--;
        }
        if(i>0)
            return false;
        else
        return true;
        
    }
}