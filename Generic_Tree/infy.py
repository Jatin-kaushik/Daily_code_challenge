def MinTime(N, K, Time, Type):
  dict1 = {}
  dict2 = {}
  tot_time =0

  i = 0
  while(i<len(Type)):
    if Type[i] not in dict1:
        dict1[Type[i]] = Time[i]
    else:
        dict2[Type[i]] = 1
    i+=1

  tot_time  =0

  # print(dict1, dict2)
  for k,v in dict1.items():
    tot_time+=v
  if(len(dict2)> len(dict1)):
    gap = len(dict2) - len(dict1)
    tot_time +=gap
  return tot_time