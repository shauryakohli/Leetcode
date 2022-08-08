class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        if (nums.length == 0 || nums.length  == 1){
             return nums.length;
         }
         Arrays.sort(nums);
         int count = 1;
         int max_count = 0;
         for (int i = 1; i < nums.length; i++){
             if (nums[i] - nums[i-1] == 1){
                 count++;
             }
             else if(nums[i] - nums[i-1] == 0){
            }
             else{
                 count = 1;
             }
           
             if (count > max_count){
                 max_count = count;
             }
         }
         return max_count;
        */
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int e: nums){
            set.add(e);
        }
        for(int e:set){
            if(!set.contains(e-1)){
                int len = 1;
                while(set.contains(++e)){
                    len++;
                }
                count = Math.max(count,len);
            }
        }
        return count;

        
    }
}