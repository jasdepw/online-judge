import collections

def solution(participant, completion):
    participant.sort()
    completion.sort()
    
    answer = collections.Counter(participant) - collections.Counter(completion)
    for name, value in answer.items():
        answer = name
        
    return answer