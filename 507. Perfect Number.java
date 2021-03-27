class Solution {
    public boolean checkPerfectNumber(int num) {
        
        boolean answer = false;
        
        if( (num % 10) == 6 || (num % 10) == 8 ){
            
            int sum = 0;
        
            for( int i = 1 ; i < num - 1 ; i++ ){
                if( (num % i) == 0 ){
                    sum += i;
                }
            }
        
            if( num == sum ){
                answer = true;
            }
        
            return answer;
            
        }else{
            
            return false;
            
        }      
    }
}