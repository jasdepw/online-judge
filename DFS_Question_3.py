def solution(begin, target, words):
    if target not in words:
        return 0
    
    answer = 0
    converted_Word = [begin] 
    convert_Route = list()
    
    while True:
        for i in converted_Word:
            convert_Route.clear()
            for j in words:
                convert = 0
                for k in range(0, len(begin)):
                    if i[k] != j[k]:
                        convert += 1
                    if convert > 1:
                        break
                if convert == 1:
                    convert_Route.append(j)
                    words.remove(j)
        answer += 1
        
        if target in convert_Route:
            return answer
        else:
            converted_Word = convert_Route