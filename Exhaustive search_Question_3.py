def solution(brown, yellow):
    total = brown + yellow
    
    for width in range(total, 2, -1):
        if total % width == 0:
            depth = total // width
            if yellow == (width - 2)*(depth - 2):
                return [width, depth]