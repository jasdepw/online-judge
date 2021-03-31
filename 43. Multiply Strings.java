class Solution {
    public String multiply(String num1, String num2) {
        
        int[] answer = new int[num1.length() + num2.length()];
        
        for( int i = num1.length() - 1 ; i >= 0 ; i-- ){
            for( int j = num2.length() - 1 ; j >= 0 ; j-- ){
                
                int n1 = Integer.valueOf(num1.charAt(i) - '0');
                int n2 = Integer.valueOf(num2.charAt(j) - '0');
                
                answer[i+j+1] += n1*n2;
            }
        }
        
 
        for( int i = answer.length - 1 ; i > 0 ; i-- ){
            answer[i - 1] += answer[i]/10;
            answer[i] = answer[i]%10;
        }
        
        boolean check = false;
        
        StringBuilder sb = new StringBuilder("");
        
        for( int i = 0 ; i < answer.length ; i++ ){
            if( answer[i] != 0 && !check )
                check = true;
            
            if(check){
                sb.append(answer[i]);
            }
        }
        
        if(sb.toString().length() == 0){
            return "0";
        }
        
        return sb.toString();
    }
}