class Solution {
    public int lis(int ind, int prev, int arr[], int dp[][]){
        if(ind == arr.length){
            return 0;
        }
        if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];
        
        int x = lis(ind+1,prev,arr,dp);
        int y = 0;
        if(prev == -1 || arr[ind]>arr[prev]){
            y = 1 + lis(ind+1,ind,arr,dp);
        }
        
        return dp[ind][prev+1] = Math.max(x,y);
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length+1];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return lis(0,-1,nums,dp);
    }
}