def solution(t):
    answer = 0
    
    for i in range(1, len(t)):
        for j in range(i + 1):
            if j == 0:
                t[i][j] += t[i-1][j]
            elif j == i:
                t[i][j] += t[i-1][j-1]
            else:
                t[i][j] += max(t[i-1][j], t[i-1][j-1])
        
    answer = max(t[-1])            
    return answer