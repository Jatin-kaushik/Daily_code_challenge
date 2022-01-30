n = int(input())

def perfect_sqr(n):
    res = []
    for i in range(1, n+1):
        if (i**(0.5)) == int(i**(0.5)):
            res.append(i)
    return res
        
def prob(n, player):
    if(n == 0):
        if (player == "t"):
            # global flag = False
            return False
        else:
            return True
    ls = perfect_sqr(n)
    for i in ls:
        if (player == 't'):
            res = prob(n-i, "f")
        else:  
            res = prob(n-i, "t")
        if res == False:
            return False
    return True

print(prob(n, "t"))