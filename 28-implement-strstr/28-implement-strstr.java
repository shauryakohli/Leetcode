class Solution {
        public int strStr(String haystack, String needle) {
        
        if (haystack == null || needle == null) {
            return -1;
        }
        
       return haystack.indexOf(needle);
        
        
    }
}