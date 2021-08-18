from itertools import permutations
import math

def isPrime(n):
    if n < 2:
        return False
        
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
            
    return True

def solution(numbers):
    answer = 0
    allnumber = []
    
    for i in range(1, len(list(numbers))+1):
        temp = list(permutations(numbers, i))
        for j in temp:
            allnumber.append(int(''.join(j)))
            
    allnumber = list(set(allnumber))
    
    for i in allnumber:
        if isPrime(i) == True:
            answer += 1
            
    return answer 