fruitmarket = {"KIWI": 50,
"apple": 30,
"custard": 60,
"banana":80,
"orange": 70
}
fruitmarket["grapes"] = 35
fruitmarket["papaya"] = 45
fruitmarket.pop("custard")

for i in fruitmarket :
 print(i)
priceoffruit = input("which fruit price are you looking for? : ")
priceoffruitLookingfor = fruitmarket.get(priceoffruit)
print(priceoffruitLookingfor)
typeoffruit = input("which fruit are you looking for? : ").lower()
if(typeoffruit in fruitmarket) :
        print("yes", typeoffruit , "is available ")
else :
        print("Sorry", typeoffruit , "is not available ")    


