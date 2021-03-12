class Solution {
    public int[] plusOne(int[] digits) {
        
        int end = digits.length - 1;
        
        digits[end] += 1;
        
        
        if( digits[end] < 10 ){
            return digits;
        }
        
        for( int i = end ; i > 0 ; i-- ){
            if( digits[i] > 9 ){
                digits[i] = 0;
                digits[i-1] += 1;           
            }
        }
        
        if(digits[0] > 9){            
            int[] answer = new int[end+2];
            
            answer[0] = 1;
            answer[1] = 0;
            
            for( int i = 2 ; i < answer.length ; i++ ){
                answer[i] = digits[i-1];
            }
            
            return answer;            
        }
        
        return digits;           
    }
}