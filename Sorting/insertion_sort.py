def insertionsort(arr):
    for i in range(1, len(arr)):
        current = arr[i]
        j = i-1
        while arr[j] > current and j>=0:
            arr[j+1] = arr[j]
            j-=1
        
        arr[j+1] = current
    return arr


print("Please enter size of the Array ")
n = int(input())
arr = [None]*n
print("Please enter elements of Array ")
for i in range(n):
    arr[i] = int(input())
print("Sorted Insertion array ")
print(insertionsort(arr))