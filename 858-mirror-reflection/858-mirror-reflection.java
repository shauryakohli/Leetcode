class Solution {
    public int mirrorReflection(int p, int q) {
        int ref=p;
        int ext =q;
        while(ext%2==0 && ref%2==0)
        {
            ext=ext/2;
            ref=ref/2;
        }
        if(ext%2==0 && ref%2!=0)
            return 0;
        if(ext%2==1 && ref%2==0)
            return 2;
        if(ext%2==1 && ref%2!=0)
            return 1;
        
        return -1;
    }
}