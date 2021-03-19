class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int answer = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sorted().toArray()[k-1];            
            
        return answer;
    }
}