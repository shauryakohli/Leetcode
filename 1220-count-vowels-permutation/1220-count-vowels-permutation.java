
class Solution {
    private Map<String,Long>map=new HashMap<>();
        private int MOD=1000000007;
        public int countVowelPermutation(int n)
      {
        long total=0;
        char[] charSet=new char[]{'a','e','i','o','u'};
        for(char c: charSet)
        {
            total=(total+helper(n-1,c))% MOD;
        }
         return (int)total;
      }
  public long helper(int remainingChar,char prevChar)
      {
             if(remainingChar==0)
                 return 1;
             String key= " " +remainingChar+prevChar;
             if(map.containsKey(key))
                 return map.get(key);
             long total=0;
             switch(prevChar)
             {
                 case 'a': total=(helper(remainingChar-1,'e')) % MOD;
                     break;
                 case 'e': total=(helper(remainingChar-1,'a') + helper(remainingChar-1,'i')) % MOD;
                     break;
                 case 'i': total=(helper(remainingChar-1,'a')+ helper(remainingChar-1,'e') + helper(remainingChar-1,'o') + helper(remainingChar-1,'u')) % MOD ;
                     break;
                 case 'o': total=(helper(remainingChar-1,'i')+helper(remainingChar-1,'u')) % MOD;
                     break;
                 case 'u': total=(helper(remainingChar-1,'a'))% MOD;
                     break;     
             }
        map.put(key,total);
      return total;
    }
}