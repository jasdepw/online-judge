class Solution:
    def jump(self, nums: List[int]) -> int:
        answer = 0
        
        #현재 위치
        curr_position = 0
        #현 위치에서 이동 가능한 위치
        next_position = 0
        
        while next_position < len(nums) - 1:
            #현 위치에서 이동 가능한 가장 먼 곳
            temp = 0
            
            for i in range(curr_position, next_position + 1):
                temp = max(temp, i + nums[i])
                
            curr_position = next_position + 1
            next_position = temp
            answer += 1
            
        return answer