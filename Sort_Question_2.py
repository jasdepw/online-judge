def solution(numbers):
    #string으로 치환 후 list로 변환
    numbers = list(map(str, numbers))
    #lanbda x : x * 3 -> numbers 인자 각각의 문자열을 3번 반복
    #numbers의 원소는 0 이상 1000이하의 값을 가지기 때문에 자리수를 맞춰서 비교하기 위함
    numbers.sort(key = lambda x : x * 3, reverse = True)
    
    answer = str(int(''.join(numbers)))

    return answer