def solution(numbers, target):
    answer = 0
    n = [0]
    
    for i in numbers:
        temp = []
        for j in n:
            temp.append(j + i)
            temp.append(j - i)
        n = temp
    
    for k in n:
        if k == target:
            answer += 1
    
    return answer