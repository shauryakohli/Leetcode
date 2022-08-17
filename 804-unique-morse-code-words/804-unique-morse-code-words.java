class Solution {
    public int uniqueMorseRepresentations(String[] words) {
     String arr[]=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String>set=new HashSet<>();
        for(String word:words)
        {
            set.add(transform(word,arr));
        }
        return set.size();
    }
      private String transform(String word,String arr[])
      {
          StringBuilder sb=new StringBuilder();
          for(char i:word.toCharArray())
          {
              sb.append(arr[(int)i-97]);
          }
            return sb.toString();
    }
}

