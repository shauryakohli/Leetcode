class Solution {
    public int jump(int[] nums) {
     int n = nums.length;
    int[] dp = new int[nums.length];
    Arrays.fill(dp, nums.length);
    dp[0] = 0;
    for (int i = 0; i < dp.length; i++) {
        int right = Math.min(nums[i], nums.length - i - 1);
        for (int j = 1; j <= right; j++) {
            dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
        }
    }
    return dp[nums.length - 1];
    }
}