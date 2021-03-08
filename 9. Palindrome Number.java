class Solution {
    public boolean isPalindrome(int x) {
        
        boolean answer = false;        
        StringBuffer sb = new StringBuffer();       
        
        if( x < 0 ){
            return false;
        }
        
        sb.append(x);             
        String xStr = sb.toString();       
        
        sb.reverse();
        String xReverse = sb.toString();
        
        if ( xStr.equals(xReverse) ){
            answer = true;
        }
        
        return answer;
    }
}