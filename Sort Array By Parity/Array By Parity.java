class Solution {
    public int[] sortArrayByParity(int[] A) {
        int index=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                int temp=A[index];
                A[index++]=A[i];
                A[i]=temp;
            }
        }
        return A;
    }
}
