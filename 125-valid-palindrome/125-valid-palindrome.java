import java.util.*;
import java.lang.*;

class Solution {
    public boolean isPalindrome(String s) {
        String fstr="";
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c)||Character.isLetter(c))
            {
                fstr=fstr+c;
            }
        }
        fstr=fstr.toLowerCase();
        int a=0;
        int b=fstr.length()-1;
        while(a<=b)
        {
            if(fstr.charAt(a)!=fstr.charAt(b))
          {
            return false;
          }
        a=a+1;
        b=b-1;
        }
        return true;
    }
}