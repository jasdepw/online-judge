class Solution {
    public double myPow(double x, int n) {
        
        if( n == 0 ){
            return 1;            
        }else if( n < 0 ){
            if( (n*-1) % 2 == 0 ){
                double answer = myPow( x, n/2*-1 );
                return 1/(answer*answer);
            }else{
                double answer = myPow( x, n/2*-1 );
                return 1/(answer*answer*x);                
            }            
        }else{
            if( n % 2 == 0 ){
                double answer = myPow( x, n/2 );
                return answer*answer;
            }else{
                double answer = myPow( x, n/2 );
                return answer*answer*x;
            }
        }        
    }
}