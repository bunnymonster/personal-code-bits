#List Comprehensions

#This is the basic way to create a list.
squares = []
for x in range(10):
    squares.append(x**2)

print(squares)
#This leaves a variable x around after we are done with the list.

#Here is a better way.
squaresTwo = [x**2 for x in range(10)]

#A list comprehension adding a tuple to a list if th two values are not equal.
xyList = [(x,y) for x in [1,2,3] for y in [3,1,4] if x != y]
print(xyList)

vec = [-9,-6,-3,0,3,6,9]
#create a new list with doubled values
print([x*2 for x in vec])
#filter to exclude negatives
print([x for x in vec if x >= 0])
#apply a function to all elements
print([abs(x) for x in vec])
#call a method on each element
colors = [' red',' green',' blue ']
print([paint.strip() for paint in colors])
#create a list of tuples (number, cube)
print([(x,x**3) for x in range(6)])
#flatten a list using comprehension
vec = [[1,2,3],[4,5,6],[7,8,9]]
print([num for elem in vec for num in elem])

#List comprehensions can be nested within each other.
matrix = [
    [1,3,4,5],
    [6,4,8,1],
    [12,8,-3,2]]
print([[row[i] for row in matrix] for i in range(4)])#matrix transposition

#transposition is better done with zip.
print(list(zip(*matrix)))


