list1 = [2,3,4,9,8,7]
list2 = [10,20,30,40]
newlist = []
for i in list2 :
 if (i % 2 == 0) :
   newlist.append(i)
for i in list1 :
 if (i % 2 != 0) :
   newlist.append(i)
print("the new list is :", newlist)
