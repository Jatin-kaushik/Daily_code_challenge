def fibo(n):
    global ans
    if (n<=1):
        return
    ans *= n
    fibo(n-1)

n = int(input())
ans = 1
fibo(n)
print(ans)