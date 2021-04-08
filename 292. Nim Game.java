class Solution {
    public boolean canWinNim(int n) {
        
        if( n <= 3 ){
            return true;
        }
        
        boolean answer = true;
        
        if( n % 4 == 0 ){
            answer = false;
        }
        
        return answer;
    }
} 