#This file demonstrates the basics of lists.

animals = ["rabbit","fox","wolf","snail"]

#prints the list
print(animals)

#lists are indexed like strings. slicing works on lists.
print(animals[0])
print(animals[1:2])

#all slices return a new list containing the requested items.

#lists support concatenation
animals + ["coyote","fish"]
print(animals)

#lists are mutable
animals[3] = "shark!"
print(animals)

#new items can be added to lists using append
animals.append("housefly")
print(animals)

#assignment to slices can be done. this can remove or change elements/
animals[2:3] = []
print(animals)
#clear list by replacing all elements with an empty list
animals[:] = []
print(animals)

#len also works on lists
cubes = [1,8,27,64,125]
print(len(cubes))
