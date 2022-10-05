data = list(input())
int_data = list(map(int,data))

result = int_data[0]

for i in int_data[1:]:
    if result > 1 and i > 1:
        result *= i
    else:
        result += i 

print(result)
