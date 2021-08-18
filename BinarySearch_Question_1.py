def solution(n, times):
    answer = 0
    left = 1
    #시간이 적게 걸리는 곳에서 모두가 심사 받을 경우
    right = min(times) * n
    
    while left < right:
        mid = (left + right) // 2
        total = 0
        
        for i in times:
            total += mid // i
            
        if total >= n:
            right = mid
        else:
            left = mid + 1
            
    answer = left
    return answer