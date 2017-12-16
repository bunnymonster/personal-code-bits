#
#Del statement
#

a = [1,2,3,4,5,6,7]
del a[2]
print(a) #prints [1,2,4,5,6,7]

#del works similar to pop() but does not return a value.
del a[2:4]
print(a) #a is now [1,2,6,7]

#
#Tuples
#

#a tuple is a number of values separated by commas
t = 5,6,7,'hi'
t[1] #6

#tuples may be nested. Tuples are immutable.
u = t,(2,3,4)
print(u)

#creating an empty tuple
empty = ()
#creating a tuple with 1 element requires a trailing comma
single = 1,

#tuples can be unpacked back into a set of variables as follows
w,x,y,z = t #assign t[0] to w , t[1] to x, etc.

#
#Sets
#

#sets are created with curly braces.

basket = {'ball','cube','pyramid'}

#membership testing
'ball' in basket #true
'dog' in basket #false

a = set('abracadabra') #a = {'a','b','r','c','d'}
b = set('alakazam')
print(a)
print(b)
print(a - b) #letters in a but not in b.
print(a | b) #letters in a or b
print(a & b) #letters in both a and b
print(a ^ b) #letters in only one of a or b

#set comprehensions are also supported
a = {x for x in 'abracadabra' if x not in 'abc'}
print(a) #{'r','d'}

#
#Dictionaries
#

#creating a t=dictionary
dict = {'hi':3,'bye':55}
dict['morning'] = 67
print(dict)
#delete from dict
del(dict['bye'])
dict['say'] = 454
print(dict)
#list dictionary keys
list(dict.keys())
#in operator works on dictionary keys
'llama' in dict #false
#dictionary comprehensions are a thing
print({x: x**2 for x in (2, 4, 6)})
