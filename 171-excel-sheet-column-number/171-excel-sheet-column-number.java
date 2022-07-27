class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char c: columnTitle.toCharArray()){
            int d=c-'A'+1;
            sum = sum * 26 + d;
        }
        return sum;
    }
}