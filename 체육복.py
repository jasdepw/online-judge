def solution(n, lost, reserve):
    answer = 0
    
    #체육복을 도둑맞았지만, 여분의 체육복이 있던 케이스 제외
    real_l = [i for i in lost if i not in reserve]
    real_r = [j for j in reserve if j not in lost]
    
    for i in real_r:
        if i-1 in real_l:
            real_l.remove(i-1)
        elif i+1 in real_l:
            real_l.remove(i+1)
    
    answer = n - len(real_l)
    return answer