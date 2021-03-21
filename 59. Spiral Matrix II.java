class Solution {
    public int[][] generateMatrix(int n) {
        
        if( n == 1){
            
            int[][] answer1 = new int[1][1];
            answer1[0][0] = 1;
                
            return answer1;
        }
        
        int[][] answer = new int[n][n];
        int goWhere = 1;
        /*
            1 : Go to right
            2 : Go to down
            3 : Go to left
            4 : Go to up
        */
        int curCol = 0;
        int curRow = 0;
        
        int endUp = 1;
        int endDown = n - 1;
        int endRight = n - 1;
        int endLeft= 0;
        
        for( int i = 1 ; i < n*n + 1 ; i++ ){
            
            if( goWhere == 1 ){
                
                if( curCol == endRight ){     
                    
                    answer[curRow][curCol] = i;
                    endRight -= 1;
                    curRow += 1;                    
                    goWhere = 2;
                    
                }else{
                    
                    answer[curRow][curCol] = i;
                    curCol += 1;
                    
                }                
            }else if( goWhere == 2 ){
                
                if( curRow == endDown ){
                    
                    answer[curRow][curCol] = i;
                    endDown -= 1;
                    curCol -= 1;                    
                    goWhere = 3;
                    
                }else{
                    
                    answer[curRow][curCol] = i;
                    curRow += 1;
                    
                }       
                
                
            }else if( goWhere == 3 ){
                
                if( curCol == endLeft ){
                    
                    answer[curRow][curCol] = i;
                    endLeft += 1;
                    curRow -= 1;                    
                    goWhere = 4;
                    
                }else{
                    
                    answer[curRow][curCol] = i;
                    curCol -= 1;
                    
                }       
                
                
            }else if( goWhere == 4 ){
                
                if( curRow == endUp ){
                    
                    answer[curRow][curCol] = i;                    
                    endUp += 1;
                    curCol += 1;                    
                    goWhere = 1;
                    
                }else{
                   
                    answer[curRow][curCol] = i;     
                    curRow -= 1;
                    
                }                       
                
            }         
            
            
        }
        
        return answer;
    }
}