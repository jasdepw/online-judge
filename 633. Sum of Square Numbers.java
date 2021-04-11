class Solution {
    public boolean judgeSquareSum(int c) {
        
        int sqrtC = (int)Math.sqrt(c);
            
        if( sqrtC*sqrtC == c || sqrtC*sqrtC*2 == c ){
            return true;
        }        
        
        int i = 0;
        while( i <= sqrtC ){
            
            if( i*i + sqrtC*sqrtC == c ){
                return true;
            }else if( i*i + sqrtC*sqrtC < c  ){
                i++;
            }else{
                sqrtC--;
            }
            
        }
        
        return false;
    }
}   