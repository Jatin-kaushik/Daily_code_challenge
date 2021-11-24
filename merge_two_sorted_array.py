def mergearray(arr1, arr2):
    i = 0
    j = 0
    k = 0
    res = [len(arr1) + len(arr2)]
    while(i < len(arr1) and j<len(arr2)):
        print(i, j, k, res)
        if arr1[i]<arr2[j]:
            print("In If")
            res[k] = arr1[i]
            i+=1
            k+=1
        else:
            print("In Else")
            res[k] = arr2[j]
            j+=1
            k+=1
    
    if (i != len(arr1)):
        while(i!= len(arr1)):
            res[k] = arr1[i]
            i+=1
            k+=1
        
    if (j != len(arr2)):
        while( j!= len(arr2)):
            res[k] = arr2[j]
            j+=1
            k+=1
    
    return res

    
n1 = int(input())
arr1 = [None]*n1
for i in range(n1):
    arr1[i] = int(input())

n2 = int(input())
arr2 = [None]*n2
for i in range(n2):
    arr2[i] = int(input())

print(mergearray(arr1, arr2))