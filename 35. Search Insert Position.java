class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int answer = 0;
        
        int start = 0;
        int end = nums.length - 1;
        
        while( start <= end ){
            int center = ( start + end ) / 2;
            
            if( nums[center] == target ){
                return center;
            }else if( nums[center] < target ){
                start = center + 1;
            }else{
                end = center - 1;
            }
        }
        
        answer = start;
        
        return answer;
    }
}