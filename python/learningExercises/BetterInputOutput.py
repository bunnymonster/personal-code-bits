#
#Fancier Strings
#

s = 'Hello World'
print(str(s)) #str() returns a representation of the string that is
#human readable.
print(repr(s)) #repr() returns a representation readable by the interpreter.

x = 10 * 3.25
y = 200 * 200
s = 'The value of x is ' + repr(x) + ', and y is ' + repr(y)
print(s)

#repr() adds string quotes and special characters.
hello = 'hello, world\n'
hellos = repr(hello)
print(hellos)

#writing a table using repr() and rjust().
for x in range(1, 10):
    print(repr(x).rjust(2), repr(x*x).rjust(3), end = ' ')
    #note the 'end' statement on previous line
    print(repr(x*x*x).rjust(4))

#writing a table using string format() methods
for x in range(1, 10):
    print('{0:2d} {1:3d} {2:4d}'.format(x, x*x, x*x*x))

#zfill()
print('12'.zfill(5))

#basic string format()
print('{0} and {1} and {2}, oh my!'.format('lions', 'tigers', 'bears'))
#the numbers determine the argument that fills the spot in the string
print('{1} and {2} and {0}, oh my!'.format('lions','tigers','bears'))
#keywords can be used as well
print('{food} is {adjective} today!'.format(food='broccoli', adjective='green'))

foodstuff = 'pastries'
print('My son is craving {}.'.format(foodstuff))
#!r applies repr() before evaluation, !s for str(), and !a for ascii()
print('My son is craving {!r}.'.format(foodstuff))

#rounding after decimal with .[d]f
print('the value of pi is approximately {0:.3f}.'.format(3.1415926536))
#use ':(integer)' to set a minimum width.
table = {'Baker':3124, 'Mike':2344, 'Kitty':7658}
for name, phone in table.items():
      print('{0:10} ==> {1:10d}'.format(name, phone))

#format strings can be referenced by name as well as position.
print('Baker: {0[Baker]:d}; Mike: {0[Mike]:d}; Kitty: {0[Kitty]:d}'.format(table))

#the % operator can also be used for string formatting
print('pi is approximately %5.3f' % 3.1415926536)
