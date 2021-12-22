def preprocessing(str1):
  result = ""
  arr = [0]*len(str1)
  test = {'1', '2', '3', '4', '5' , '6' , '7' , '8' , '9', '0'}
  ind = 0
  for i in str1:
    if i in test:
      arr[ind] = int(ind)
    else:
      arr[ind] = 0
    ind+=1
  for i in arr:
    if i>0:
      result = result + str(i)
  return result


def main():
  str1 = input()
  print(preprocessing(str1))

main()
