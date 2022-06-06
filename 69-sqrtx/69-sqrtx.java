class Solution {
    public int mySqrt(int x) {
         long temp=0;
         long i=0;
        while(x>=i*i)
        {
            temp=i;
            i++;
        }
        return (int)temp;
    }
}