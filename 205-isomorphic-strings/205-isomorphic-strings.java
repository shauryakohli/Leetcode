class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<Character, Character>();
        Map<Character, Character> map2 = new HashMap<Character, Character>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++){
            char one = s.charAt(i);
            char two = t.charAt(i);
            if(map1.containsKey(one)){
                char _one = map1.get(one);
                if(_one != two) return false;
            } else {
                map1.put(one, two);
            }
            if(map2.containsKey(two)){
                char _one = map2.get(two);
                if(_one != one) return false;
            } else {
                map2.put(two, one);
            }
        }
        return true;
    }
}