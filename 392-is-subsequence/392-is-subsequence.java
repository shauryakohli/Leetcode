class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int s_p = 0;
        int t_p = 0;
        int count = 0;
        while(t_p!=t.length()){
            if(s.charAt(s_p)==t.charAt(t_p)){
                s_p++;
                t_p++;
                count++;
                if(count==s.length()){
                    return true;
                }
            }
            else{
                t_p++;
            }
        }
        return false;
    }
}