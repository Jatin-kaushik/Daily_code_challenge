import heapq

totalfloor = int(input())
n = int(input())
bread_floor = int(input())
bread_price = int(input())

avail_cake_flavour = []
for i in range(n):
    avail_cake_flavour.append(int(input()))
    
req_cake_flavour = []
for i in range(n):
    req_cake_flavour.append(int(input()))

req_cake_floor = []
for i in range(n):
    req_cake_floor.append(int(input()))
    
cake_price = []
for i in range(n):
    cake_price.append(int(input()))
    
def max_profit(totalfloor,n, bread_floor,bread_price,avail_cake_flavour,req_cake_flavour,req_cake_floor,cake_price):
    ls = []
    ls.append(bread_price/bread_floor, 0, 9999999)
    
    
    