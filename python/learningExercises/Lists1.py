from collections import deque #for queues

#
#Basic list methods
#

letters = ['a','b','c','d','e','f','a']
letters.count('a') #2
letters.count('b') #1
letters.index('b') #1
letters.index('a',2) #find next 'a' starting after index 2.
#Returns 6 in this case.

letters.reverse()
letters #['a','f','e','d','c','b','a']
letters.append('zz') #adds 'zz' to end of list
letters.sort()
letters #['a','a','b','c','d','e','f','zz']
letters.pop() #returns last element of list and removes it. in this case 'zz'

#
#Lists as stacks
#

#push using append(), pop using pop()
stack = [2,3,4]
stack.append(5)
stack #[2,3,4,5]
stack.pop() #returns 5, stack is now [2,3,4]

#
#Lists are not good as queues, use deque from collections module
#
queue = deque(['Ally','Bart','Chris'])
queue.append('Harrison') #Harrison arrives
queue.append('Larry')
queue.popleft() #first to arrive now leaves. Returns 'Ally'

#
#List comprehensions
#
