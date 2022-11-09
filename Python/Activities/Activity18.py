from cgi import print_arguments
from random import sample
import pandas
dataframe = pandas.read_csv("sample.csv")
print("Full Data : ", dataframe)

print("Usernames")
print(dataframe["Usernames"])
print("Usernamr : ",dataframe["Usernames"][1] ,"password : " ,dataframe["Passwords"][1])

print(dataframe.sort_values('Usernames'))
print(dataframe.sort_values('Passwords', ascending=False))