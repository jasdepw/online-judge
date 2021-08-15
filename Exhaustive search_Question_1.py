def solution(answers):
    answer = []
    supoja1 = [1, 2, 3, 4, 5]
    supoja2 = [2, 1, 2, 3, 2, 4, 2, 5]
    supoja3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cc = [0, 0, 0]
    
    for i in range(len(answers)):
        n1 = 5
        if answers[i] == supoja1[i%n1]:
            cc[0] += 1
            
    for j in range(len(answers)):
        n2 = 8
        if answers[j] == supoja2[j%n2]:
            cc[1] += 1
            
    for k in range(len(answers)):
        n3 = 10
        if answers[k] == supoja3[k%n3]:
            cc[2] += 1 
    
    m_sp = max(cc)
    
    for i in range(0, 3):
        if cc[i] == m_sp:
            answer.append(i+1)
    
    return answer