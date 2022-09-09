import java.lang.*;
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(a,b)->(a[0]-b[0]));
        int ans=0;
        int local_max=Integer.MIN_VALUE;
        int global_max=Integer.MIN_VALUE;
        for(int i=properties.length-1;i>0;i--)
        {
            local_max=Math.max(local_max,properties[i][1]);
            if(global_max>properties[i][1])
                ans++;
            if(properties[i][0]!=properties[i-1][0])
            {
                global_max=Math.max(global_max,local_max);
                local_max=Integer.MIN_VALUE;
            }
        }
        
        if (global_max>properties[0][1])
               ans++;
        return ans;
    }
}