class Solution {
  public int romanToInt(String s) {
      
      int answer = 0;
      char[] sArray = s.toCharArray();
      for ( int i = 0 ; i < s.length() ; i++ ){
          if ( sArray[i] == 'M' ){
              answer += 1000;                
          }else if ( sArray[i] == 'D' ){
              answer += 500;        
          }else if ( sArray[i] == 'C' ){
              if ( i == s.length() - 1 ){                    
                      answer += 100; 
              }else{
                  if ( sArray[i+1] == 'D' || sArray[i+1] == 'M' ){
                      answer -= 100;
                  }else{
                      answer += 100; 
                  }                    
              }
          }else if ( sArray[i] == 'L' ){
              answer += 50;        
          }else if ( sArray[i] == 'X' ){
              if ( i == s.length() - 1 ){                    
                      answer += 10; 
              }else{
                  if ( sArray[i+1] == 'L' || sArray[i+1] == 'C' ){
                      answer -= 10;
                  }else{
                      answer += 10;
                  }
              }
          }else if ( sArray[i] == 'V' ){
              answer += 5;        
          }else if ( sArray[i] == 'I' ){
              if ( i == s.length() - 1 ){                    
                      answer += 1; 
              }else{
                  if ( sArray[i+1] == 'V' || sArray[i+1] == 'X' ){
                      answer -= 1;
                  }else{
                      answer += 1;                    
                  }  
              }     
          }else{
              System.out.println("Error");
              break;
          }
      }
      
      return answer;
  }
}