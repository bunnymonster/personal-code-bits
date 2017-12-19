#
#For Loops
#

#for loops iterate over the set of items in a given list in order.
words = ['fox','flop','number','hungry','listing']
for w in words:
    print(w,len(w))

#To modify a sequence while iterating, first make a copy using slice
for w in words[:]: #loop over slice copy of entire list
    if len(w) > 6:
        words.insert(0,w) #insert words with len > 6 in front of list.

print(words)

#
#Range functions
#

#basic range function
for i in range(5):
    print(i)

print(range(5,10)) #range(a,b) is a inclusive, b exclusive
print(range(0,10,3)) #3rd argument allows increment size
print(range(-10,-100,-30)) #range allows negative increment sizes

#iterating over indices of sequence, combine range and len
a = ['Mar','Bez','lop','Kinlin','blarg']
for i in range(len(a)):
     #0 Mar
     #1 Bez
     #2 lop
     #3 Kinlin
     #4 blarg
     print(i,a[i])

#using 'print(range(10))' prints 'range(10)'
print(range(10))
list(range(5)) # iterate over range(5)

#
# Break, Continue, Pass
#

#break breaks out of the innermost loop
for n in range(2,25):
    for x in range(2,n):
        if n % x == 0:
            print(n, 'equals', x, '*', n//x)
            break
    else:   #This is correct. This else belongs to the for loop,
             #not the if statement
        #loop fell through without finding a factor
        print(n, 'is a prime number')
    
#continue forwards the code to the next iteration of the loop
for num in range(2,25):
    if num % 2 == 0:
        print("Found an even number", num)
        continue
    print("Found a number", num)

#
#Pass
#

while True:
     pass #busy wait for ctrl-c

#pass does nothing.
#It is used when a statement is required but no action is needed.
#This can be used as a placeholder for functions that yet need to be implemented.

