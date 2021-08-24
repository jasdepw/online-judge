from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = deque([0] * bridge_length)
    #다리 위에 있는 트럭 하중의 합
    bridge_weight = 0
    #대기 중인 트럭들
    waiting_trucks = deque(truck_weights)
    
    while bridge:
        bridge_weight -= bridge[0]
        bridge.popleft()
        answer += 1
        if waiting_trucks:
            if bridge_weight + waiting_trucks[0] <= weight:
                #다리 위 하중의 합과 다음에 진입할 트럭의 무게의 합이 최대 하중 이하
                bridge_weight += waiting_trucks[0]
                #다리에 트럭이 진입하고 대기줄에서 빠짐
                bridge.append(waiting_trucks.popleft())
            else:
                #최대 하중을 초과하는 경우 다리 맨 앞에 있는 트럭이 나옴
                bridge.append(0)
                
    return answer