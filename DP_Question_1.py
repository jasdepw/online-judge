def solution(N, number):
    answer = -1
    DP = []
    
    for i in range(1, 10):
        numbers = set()
        numbers.add(int(str(N) * i))
        
        for j in range(0, i-1):
            for k in DP[j]:
                for l in DP[-j-1]:
                    numbers.add(k + l)
                    numbers.add(k - l)
                    numbers.add(k * l)
                    
                    if l != 0:
                        numbers.add(k // l)
        
        if number in numbers:
            answer = i
            break
        
        DP.append(numbers)
           
    return answer