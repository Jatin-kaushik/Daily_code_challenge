def selectionsort(arr):
    for i in range(len(arr)-1):
        minidx = i
        for j in range(i+1, len(arr)):
            if arr[minidx] > arr[j]:
                minidx = j
                
        if minidx != i:
            arr[i], arr[minidx] = arr[minidx], arr[i]
    
    return arr
        

print("Please enter size of the Array ")
n = int(input())
arr = [None]*n
print("Please enter elements of Array ")
for i in range(n):
    arr[i] = int(input())
print("Selection Sorted array ")
print(selectionsort(arr))