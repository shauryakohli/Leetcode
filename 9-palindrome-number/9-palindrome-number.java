class Solution {
    public boolean isPalindrome(int x) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int temp=x;
        while(x>0)
        {
            int r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(temp==sum)
        {
                return true;
        }
        else
        {
                return false;
        }
    }
}