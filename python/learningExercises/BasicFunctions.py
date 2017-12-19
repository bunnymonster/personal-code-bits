def fib(n): #write fibonacci series up to n
    """Print a fibonacci series up to n.""" #docstring for function
    a, b = 0, 1
    while a < n:
        print(a, end=' ')
        a, b = b, a+b
        print()

#Now call the function we defined
fib(2000)

#functions can be assigned to other variables and those can be called
f = fib
f(100)

#functions that do not return a value return None
fib(0)
print(fib(0))

#writing a function to return a value.
def fib2(n):
    """Return a list containing the fibonacci numbers up to n"""
    result = []
    a, b = 0, 1
    while a < n:
        result.append(a)    # see below
        a, b = b, a+b
    return result

f100 = fib2(100)
print(f100) #print result.

#
#Argument values
#
def ask_ok(prompt, retries=4, reminder='Please Try Again '):
    while True:
        ok = input(prompt)
        if ok in ('y','ye','yes'):
            return True
        if ok in ('n','no','nop','nope'):
            return False
        retries = retries - 1
        if retries < 0:
            raise ValueError('invalid user response')
        print(reminder)

ask_ok('Do you really want to quit?') #calling prompt is mandatory
ask_ok('Ok to overwrite file?', 2) #can also add retries as an arg
ask_ok('OK to overwrite file?', 2, 'Come on, only yes or no.') #or you can call it with all args

#The default value is evaluated only once. the following accumulates args passed to it.
def accumArgs(a,L=[]):
    L.append(a)
    return L

print(accumArgs(1)) #[1]
print(accumArgs(2)) #[1,2]
print(accumArgs(3)) #[1,2,3]

#If you do not want the default shared between calls, write your function like this
def accumNothing(a, L=None):
    if L is None:
        L = []
    L.append(a)
    return L

print(accumNothing(1))
print(accumNothing(2))

#
#Keyword Arguments
#

def fox(color, state='happy', action='pounce', size='large'):
    print(" This fox is",color,"and is doing the", action, end=' ')

fox('red') #calling with mandatory arg
fox('red',action='jig') #calling with positional arg and keyword arg.
#The following are ok
#fox(white) 1 positional arg
#fox(color='red') 1 keyword arg
#fox('red','joous','jump') 3 positional args

#The following are not ok
#fox() required arg 'color' missing
#fox(color='red','confused') non-keyword arg after a keyword arg
#fox('red', color='white') duplicate value for the same arg
#fox(balloon='popped') unknown arg

#This demonstrates that ** produces a dictionary containing all keyword args
#after all positional args. This also includes *arguments, which collects all
#positional arguments after the last declared positional arg
#and before the keyword args.
def chocoshop(kind, *arguments, **keywords):
    print("--Do you have any",kind,"?")
    print("--I'm sorry, we are out of",kind)
    for arg in arguments:
        print(arg)
    print("-"*40)
    for kw in keywords:
        print(kw,":",keywords[kw])

chocoshop("Dark","Arg 1","arg 2","Arg 3",
          shopkeeper="Willy Wonka",
          client="Charlie",
          sketch="chocolate")
