

def solution(A):

    LIMIT = 10000000

    borders = [(i - v, 'l') for i, v in  enumerate(A)] \
              + [(i + v, 'r') for i, v in enumerate(A)]
    borders.sort()

    left_count = 0
    counter = 0

    for v, t in borders:
        if counter > LIMIT:
            return -1
        if t == 'l':
            counter += left_count
            left_count += 1
        else:
            left_count -= 1

    return counter
