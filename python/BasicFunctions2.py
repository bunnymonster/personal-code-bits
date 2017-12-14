#
# Arbitrary Arg Lists
#

#functions can be called with artbitrary argument lists.
def concat(*args, sep="/"):
    return sep.join(args)

#prints 'fox/bunny/slug'
print(concat("fox","bunny","slug"))
#prints 'apple.banana.orange'
print(concat("apple","banana","orange",sep="."))

#unpacking arg lists

#you can unpack arguments out of a tuple using the * operator

#normal call
print(list(range(3, 6)))
#call with unpacking
args = [3,6]
print(list(range(*args))) #unpacks the list [3,6] into the set of arguments 3 and 6

#
#Lambda Expressions
#

def make_multiplier(n):
    return lambda x: x*n

f =  make_multiplier(2) # f returns a function object that multiplies its argument by 2.

print(f(1)) #2
print(f(2)) #4
print(f(1.5)) #3

pairs = [(1,'F'),(2,'E'),(3,'D'),(4,'C')]
pairs.sort(key=lambda pair: pair[1]) #uses lambda to return the second element of each tuple for sorting.
print(pairs) #prints [(4,'C'),(3,'D'),(2,'E'),(1,'F')]
