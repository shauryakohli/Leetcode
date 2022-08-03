import java.util.Collections;
class Solution {
    public void sortColors(int[] nums) {
    int red=0, white=0,blue=0; 
 for(int i:nums)
 {
	 if(i==0)red++;
	 if(i==1)white++;
	 if(i==2)blue++;
 }
	
 int k=0;
 while(k<nums.length)
 {
	 if(k<red)
		 nums[k]=0;
	 if(k>=red && k<(red+white))
		 nums[k]=1;
	 if(k>=red+white && k<(red+white+blue))
		 nums[k]=2;
	 k++;
 }
    
    
    }
}