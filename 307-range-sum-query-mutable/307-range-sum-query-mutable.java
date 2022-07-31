class NumArray {
    List<Integer>list=new ArrayList<>();
    int totalsum=0;
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
            totalsum=totalsum+nums[i];
        }
    }
    
    public void update(int index, int val) {
        totalsum=totalsum+(val)-list.get(index);
        list.set(index,val);
    }
    
    public int sumRange(int left, int right) {
        int sum=totalsum;
        for(int i=0;i<left;i++)
        {
            sum=sum-list.get(i);
        }
        for(int i=right+1;i<list.size();i++)
        {
              sum=sum-list.get(i);
        }
        return sum;
    }
}
/*
class NumArray {
    List<Integer> al = new ArrayList<>();
    int totalSum=0;
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
            totalSum+=nums[i];
        }
    }
    
    public void update(int index, int val) {
        totalSum = totalSum + (val) - al.get(index);
        al.set(index,val);
    }
    
    public int sumRange(int left, int right) {
        int sum=totalSum;
        for(int i=0;i<left;i++){
                sum = sum - al.get(i);
        }
        for(int i=right+1;i<al.size();i++)
            sum = sum - al.get(i);
        return sum;
    }
}
*/
