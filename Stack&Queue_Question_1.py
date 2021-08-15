import math

def solution(progresses, speeds):
    answer = []
    day = []
    temp = 0
    temp2 = 0
    l = len(progresses)
    
    for i in range(l):
        temp = math.ceil((100 - progresses[i]) / speeds[i])
        day.append(temp)
    
    temp = day[0]
    temp2 = 1
    for i in range(1, l):
        if day[i] <= temp:
            temp2 += 1
            if i == l - 1:
                answer.append(temp2)
        else:
            answer.append(temp2)
            temp = day[i]
            temp2 = 1            
            if i == l - 1:
                answer.append(temp2)
    
    return answer