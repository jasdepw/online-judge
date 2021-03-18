class Solution {
    
    List<List<Integer>> answer = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
                
        int len = candidates.length;
        for( int i = 0 ; i < len ; i++ ){
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(candidates[i]);
            
            backtracking(candidates, i, 1, target - candidates[i], temp);
        }
        
        return answer;
    }
    
    public void backtracking(int[] candidates, int index, int tempSize, int target, List<Integer> temp){
        
        if( target == 0 ){
            answer.add(new ArrayList(temp));
            
            return;
        }
        
        int len = candidates.length;
        for( int i = index ; i < len ; i++ ){
            if(candidates[i] <= target ){
                temp.add(candidates[i]);
                backtracking(candidates, i, tempSize + 1, target - candidates[i], temp);
                temp.remove(tempSize);
            }
        }
    }
}