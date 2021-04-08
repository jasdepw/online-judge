class Solution {
    public int hIndex(int[] citations) {
        Integer conv[] = Arrays.stream(citations).boxed().toArray(Integer[]::new); 
        
        Arrays.sort(conv, Comparator.reverseOrder());
        
        int answer = 0;
        
        for( int i = 0 ; i < conv.length ; i++ ){
            if( conv[i] <= i )
                return i;

            answer++;
        }
        
        return answer;
    }
}