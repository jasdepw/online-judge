from collections import deque

def solution(prices):
    answer = []
    ekzul = deque(prices)
    
    while ekzul:
        price = ekzul.popleft()
        second = 0
        for p in ekzul:
            second += 1
            if price > p:
                break
        answer.append(second)
    
    return answer