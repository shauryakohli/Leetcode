class Solution {
    
    public int maxSubArray(int[] arr) {
        
		int localMax = 0;
		
		int globalMax = Integer.MIN_VALUE;
		
		for (int num : arr) {
			
			if (num + localMax < num) {
				
				localMax = num;
				
			} else {
				
				localMax = num + localMax;
			}
			
			if (globalMax < localMax) {
				
				globalMax = localMax;
			}
		}
		
		return globalMax;
    }
}