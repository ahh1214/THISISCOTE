n, m, k = map(int,input().split())
num_list = list(map(int, input().split()))

num_list.sort(reverse=True) # != sorted

result = 0 
cnt = 0 
for i in range(m): #연산은 총 m번 진행
    if (cnt < k):
        result += num_list[0]
        cnt += 1
        continue
    cnt = 0
    result += num_list[1]


print(result)
