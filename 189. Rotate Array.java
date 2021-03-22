class Solution {
    public void rotate(int[] nums, int k) {
        
        k %= nums.length;
        
        int count = 0;
        
        int start = 0;
        int end = 0;
        
        int current = 0;
        int prev = 0;
        int next = 0;
        int temp = 0;
        
        
        for( start = 0 ; count < nums.length ; start++ ){
            
            current = start;
            prev = nums[start];
            
            do{
                next = (current + k) % nums.length;
                temp = nums[next];
                
                nums[next] = prev;
                prev = temp;
                current = next;
                
                count++;
                
            }while(start != current);
            
        }          

        System.out.print(nums);
    }
}