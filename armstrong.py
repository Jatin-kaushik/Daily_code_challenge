def arm(n):
    sum = 0
    for i in range(len(n)):
        num = int(n[i])
        if(num != 0):
            pownum = 1
            for j in range(len(n)):
                pownum *= num
        else:
            pownum = 0    
        sum += pownum
    return sum

n  = input() # reading as string bcz digit alag krne hain sarei
result = arm(n)
if (int(n) == result):
    print("Yes, He is drinking Goat Milk")
    print("True")
else:
    print("False")