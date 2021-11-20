def bubblesort(arr):
    for i in range(len(arr)-1):
        for j in range(i,len(arr)):
            if arr[i]> arr[j]:
                arr[i], arr[j] = arr[j], arr[i]
    return arr

print("Please enter size of the Array ")
n = int(input())
arr = [None]*n
print("Please enter elements of Array ")
for i in range(n):
    arr[i] = int(input())
print("Sorted array ")
print(bubblesort(arr))

