def sum(num):
    if num:
        return num + sum(num-1)
    else :
        return 0
sumofnumbers = sum(10)
print(sumofnumbers)
