class Solution {
    public void nextPermutation(int[] nums) {
        
        int len = nums.length;
        
        int a = len - 2;
        int temp = 0;
        
        while( a >= 0 ){
            
            if(nums[a] >= nums[a+1]){
                
                a--;
                
            }else{
                
                break;
                
            }
        }
        
        if( a != -1 ){
            
            int b = len - 1;
            
            while( nums[a] >= nums[b] ){
                
                b--;
                
            }
            
            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            
        }
        
        int start = a + 1;
        int end = len - 1;
        
        while( start < end ){
            
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;   
            
            start++;
            end--;
            
        }
                 
        System.out.print(nums);
    }
    
}