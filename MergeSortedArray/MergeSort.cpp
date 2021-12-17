class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) 
    {
        for (int i = m; i < nums1.size(); i++)
            nums1[i] = INT_MIN;
        
        int pointer_one = 0;
        int pointer_two = 0;
        
        while (pointer_one < (m + n) && pointer_two < n) {
            if ((nums1[pointer_one] > nums2[pointer_two]) || (pointer_one >= m && nums1[pointer_one] == INT_MIN)) {
                for (int i = (m + n - 1); i > pointer_one; i--)
                    nums1[i] = nums1[i - 1];
                nums1[pointer_one] = nums2[pointer_two];
                pointer_two++;
            }
            else {
                pointer_one++;
            }
        }
    }
};
