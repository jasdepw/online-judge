class Solution {
    public boolean isValid(String s) {
                
        int s_len = s.length();
        char[] s_Array = s.toCharArray();
        
        Stack<Character> stack = new Stack<Character>();
        
        for( int i = 0 ; i < s_len ; i++ ){
            if( s_Array[i] == '(' ){
                stack.push('(');                
            }else if( s_Array[i] == '[' ){
                stack.push('[');
            }else if( s_Array[i] == '{' ){
                stack.push('{');                
            }else if( s_Array[i] == ')' ){
                if( !stack.empty() && stack.peek().equals('(') ){
                    stack.pop();
                }else{
                    return false;
                }
            }else if( s_Array[i] == ']' ){
                if( !stack.empty() && stack.peek().equals('[') ){
                    stack.pop();
                }else{
                    return false;
                }                
            }else if( s_Array[i] == '}' ){
                if( !stack.empty() && stack.peek().equals('{') ){
                    stack.pop();
                }else{
                    return false;
                }                
            }
        }
        return stack.empty();
    }
}