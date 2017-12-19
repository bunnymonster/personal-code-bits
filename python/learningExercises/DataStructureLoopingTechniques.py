#Looping through a dictionary
grades = {'A': 90,'B': 80,'C': 70}
for k,v in grades.items():
    print(k,v)

#Looping through a sequence
for i, v in enumerate(['tic','tac','tok']):
    print(i, v) #prints the index and the value in the enumeration.

#Looping over 2 sequences at once using zip to pair the lists.
animals = ['fox','squirrel','hedgehog']
colors = ['red','green','blue']

for a, c in zip(animals, colors):
    print('The {0} is very very {1}'.format(a,c))

#looping over a reversed sequence
for i in reversed(range(1,10)):
    print(i)

#Looping over a sequence in sorted order.
basket = ['apple','banana','kiwi','apple','pear']
for f in sorted(set(basket)):
    print(f)

#Do not change lists while looping through them.  Create new lists instead!
import math
raw_data = [3.2,float('NaN'),4.5]
filtered_data = []
for value in raw_data:
    if not math.isnan(value):
        filtered_data.append(value)

print(filtered_data)

#
#Sequences or other data types can be compared with other
#objects of the same type.  comparisons are done recursively based on
#lexicographic ordering of the sets.
#
