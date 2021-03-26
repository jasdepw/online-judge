class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        if( timeSeries.length == 0 ){
            return 0;
        }
        
        int answer = 0;
        
        for( int i = 0 ; i < timeSeries.length - 1 ; i++ ){
            
            int current = timeSeries[i];
            int next = timeSeries[i + 1];
            
            answer += Math.min(next - current, duration);
            
        }
        
        answer += duration;
        
        return answer;
        
    }
}