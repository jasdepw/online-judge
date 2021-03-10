class Solution {
    public String convert(String s, int numRows) {
        
        int s_len = s.length();
        String answer = "";
        
        if( numRows == 1 || numRows == s_len ){
            return s;
        }
        
        String[] conversion = new String[numRows];
        
        for( int i = 0 ; i < numRows ; i++ ){
            conversion[i]= "";
        }
        
        String[] s_split = s.split("");
        
        boolean isDown = true;
        int conv_Row = 0;
        
        for( int i = 0 ; i < s_len ; i++ ){
            if( isDown == true ){
                conversion[conv_Row] += s_split[i];
                if( conv_Row == numRows - 1 ){
                    isDown = false;
                    conv_Row -= 1;
                }else{
                    conv_Row += 1;                    
                }
            }else{
                conversion[conv_Row] += s_split[i];
                if( conv_Row == 0 ){
                    isDown = true;
                    conv_Row += 1;
                }else{
                    conv_Row -= 1;
                }
            }
        }
        
        for( int i = 0 ; i < numRows ; i++ ){
            answer += conversion[i];
        }
        
        return answer;
    }
}