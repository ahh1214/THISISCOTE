n = int(input()) #모험가 수
data = list(map(int,input().split())) #공포도
data.sort()

cnt = 0 
result = 0 

for i in range(n):
    cnt += 1
    if cnt >= data[i]:
        cnt = 0
        result += 1 

print(result)
