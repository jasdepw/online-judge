def solution(array, commands):
    sliced = []
    answer = []
    
    for i in range(len(commands)):
        s = -1 + commands[i][0]
        e = commands[i][1]
        t = -1 + commands[i][2]
        sliced = array[s:e]
        sliced.sort()
        answer.append(sliced[t])
            
    return answer