class Solution {
public:
    int i;
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()==0)
            return 0;
        int slowponter=0;
        for(int j=1;j<nums.size();j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
                
            }
        }
            
        return i+1;
    }
};