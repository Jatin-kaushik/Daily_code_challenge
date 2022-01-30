n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))

def valid_pair(n, arr):
    maxele = max(arr)
    ls = []
    for i in range(2, int(maxele**0.5)):
        for j in range(2, int(maxele**0.5)):
            if i**j + j**i <= maxele:
                ls.append(i**j + j**i)
    ans  = 0
    for i in arr:
        for j in ls:
            if j<=i:
                ans += j
    return ans
print(valid_pair(n, arr))