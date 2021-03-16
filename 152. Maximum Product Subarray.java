class Solution {
    public int maxProduct(int[] nums) {
        
        int answer = nums[0];
        int max = nums[0];
        int min = nums[0];
        
        int end = nums.length;
        
        for( int i = 1 ; i < end ; i++ ){
            int temp = max;
            max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
            min = Math.min(Math.min(nums[i] * temp, nums[i] * min), nums[i]);
            
            answer = Math.max(answer, max);
        }
        
        return answer;
    }
}