def count_sum_pairs(arr, X):
    count = 0
    left = 0
    right = len(arr) - 1
    
    
    while left < right:
        current_sum = arr[left] + arr[right]
        if current_sum == X:
            count += 1
        if current_sum <= X:
            left += 1
        else:
            right -= 1
    
    return count
