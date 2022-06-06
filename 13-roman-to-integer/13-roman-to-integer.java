class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> numbersMap = new HashMap<>();
    numbersMap.put('I',1);
    numbersMap.put('V',5);
    numbersMap.put('X',10);
    numbersMap.put('L',50);
    numbersMap.put('C',100);  
    numbersMap.put('D',500);  
    numbersMap.put('M',1000);
        int res=0;
        for(int i=0;i<s.length();i++)
       {
         if(i+1<s.length() && numbersMap.get(s.charAt(i+1)) > numbersMap.get(s.charAt(i)))
        {
         res -= numbersMap.get(s.charAt(i));
        }
        // Case 2: just add the corresponding number to result.
        else
       {
         res += numbersMap.get(s.charAt(i));
       }     
     }
        return res;
    }
}