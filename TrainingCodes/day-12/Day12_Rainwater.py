l= [4,2,0,3,2,5]
count=0
for i in range(len(l)):
     maxl=max(l[:i+1])
     maxr=max(l[i:])
     if maxl>maxr :
         maxr=maxr-l[i]
         count+=maxr
     else :
        maxl=maxl-l[i]
        count+=maxl
print(count)
