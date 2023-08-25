def count_sum_pairs(arr, X):
    count = 0
    front = 0
    back = len(arr) - 1
    
    
    while front < back: # while front and back don't cross
        current_sum = arr[front] + arr[back]
        if current_sum == X:
            count += 1
        if current_sum <= X:
            front += 1
        else:
            back -= 1
    
    return count
