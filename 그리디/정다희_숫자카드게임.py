n, m = map(int, input().split())

result = []
for i in range(n):
    row = list(map(int,input().split()))
    result.append(min(row))

print(max(result)) 
