class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        if( nums.length == 1 ){
            return false;
        }
        
        HashSet<Integer> set = new HashSet<>();
        boolean answer = false;
        
        for( int i = 0 ; i < nums.length ; i++ ){
            if(set.contains(nums[i])){
                answer = true;
            }else
               set.add(nums[i]);
        }
        
        return answer;
    }
}