class Solution {
    public int reverse(int x) {
        
        int Negative_Trigger = 0;        
        int temp = 0;
        long answer = 0;
        
                        
        if ( x == 0 ){
            return 0;
        }
        
        if ( x < 0 ){
            Negative_Trigger = 1;
            x *= -1;
        }
        
        while( x != 0 ){
            answer *= 10;
            temp = x % 10;
            answer += temp;
            x = x / 10;
        }
        
        if ( Negative_Trigger == 1 ){
            answer *= -1;
        }
        
        if ( answer < -2147483648 || answer > 2147483647 ){
            return 0;
        }
        temp = Math.toIntExact(answer);
        return temp;
    }
}