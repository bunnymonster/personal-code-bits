#This program runs through some basic operations in python

#variable assignment
firstVar = 2
secondVar = 3

#addition
print(firstVar+secondVar)

#division always returns a float
print(firstVar/secondVar)

#a basic string
myString = "This is a String!"
print(myString)

lineString = "This string has \n a newline"
#will print the following:
#This string has
# a newline
print(lineString)

#raw strings ignore special \ characters.
#This would return at the \n otherwise
print(r'C:\some\name')

#Multiline printed strings
print("""blag
blag
blag""")

#Strings can be concatenated with + and repeated with *
print(3 * 'un' + 'ium')

#string literals next to each other auto-concatenate,
#but only when they are literals. variables won't behave this way.
print('py' 'thon')

#strings can be indexed starting at 0 or starting at -1 from the end.
indexString = 'ABCDEFGHIJKL'
print(indexString[0])
print(indexString[-1])

#this is slicing.
#[a:b] means take from a inclusive to b exclusive.
#[:b] means take from start to b exclusive, [a:] means from a inclusive to end.
print(indexString[0:3])
print(indexString[:4])

#strings are immutable and cannot be modified. create a new one if you need one.
#len returns the length of a string
print(len(indexString))
