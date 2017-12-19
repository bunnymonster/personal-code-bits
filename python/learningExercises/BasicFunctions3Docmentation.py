#multiline docstring
def my_func():
    """This does nothing except document itself

    really, it doesn't do anything
    """
    pass

print(my_func.__doc__) #prints function documentation, preserves indentation

#Function annotations
def f(fox: str, flop: str = "flop") -> str:
    print("Annotations:", f.__annotations__)
    print("Arguments:",fox,flop)
    return fox + ' does the ' + flop

print(f('arctic-fluffball'))
