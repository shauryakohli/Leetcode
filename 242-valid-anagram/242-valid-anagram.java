class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length())
         return false;
        int [] char_counts =new int[26];
        for(int i=0;i<s.length();i++)
        {
            char_counts[s.charAt(i)-'a']++;
        }
       for(int i=0;i<t.length();i++)
       {
         char_counts[t.charAt(i)-'a']--;
       }
        for(int count:char_counts)
        {
            if(count!=0)
            {
                return false;
            }
        }
       return true;
    }
}