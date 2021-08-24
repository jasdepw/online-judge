from collections import deque

def solution(priorities, location):
    answer = 0
    deq = deque([waiting, idx] for idx, waiting in enumerate(priorities))
    
    while len(deq):
        work = deq.popleft()
        if deq and max(deq)[0] > work[0]:
            deq.append(work)
        else:
            answer += 1
            if work[1] == location:
                break
                
    return answer