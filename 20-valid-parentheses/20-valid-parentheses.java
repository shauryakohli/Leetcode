class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.size() > 0) {
                char p = stack.peek();
                if(p == '(' && c == ')') {
                    stack.pop();
                } else if(p == '[' && c == ']') {
                    stack.pop();
                } else if(p == '{' && c == '}') {
                    stack.pop();
                } else {
                   stack.push(c); 
                }
            } else {     
                stack.push(c);
            }
        }
        
        return stack.size() == 0;
    }
}