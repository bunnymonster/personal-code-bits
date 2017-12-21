import sys

#
#Errors and Exceptiosn
#

#Error handled with basic try except
try:
    print(x)
except:
    print('Error! x not defined.')

#multiple Exceptions may be handled by a single except
#by being listed in a tuple.
try:
    print(x)
except (RuntimeError, TypeError, NameError):
    print('Error!')

#a class C in an except clause are compatible with an exception e
#if the exception is the same class or a base class thereof.
#That is, e must be of type C or must be of type B where B is a base class of C.
class B(Exception):
    pass

class C(B):
    pass

class D(C):
    pass

for cls in [B, C, D]:
    try:
        raise cls()
    except D:
        print("D")
    except C:
        print("C")
    except B:
        print("B")
#The preceding prints "B" "C" "D" in that order.
#IF the except classes were called reversed "D" "C" "B", then it would print
#"B" "B" "B" as B is the first base class of each of the exceptions B, C, and D

#
#Else
#

#The try statement has and else clause which follows all except clauses,
#and is used for code that must run when the try block does not raise any
#exceptions.
for arg in sys.argv[1:]:
    try:
        f = open(arg, 'r')
    except OSError:
        print('cannot open', arg)
    else:
        print(arg, 'has', len(f.readlines()), 'lines')
        f.close()

#
#Raising Exceptions
#
#Raise can be used to force a specific exception.
try:
    raise NameError('HiThere')
except (NameError) as err:
    print(err)

#
#Cleanup with finally
#

#The try statement has a finally clause which executes at the end of the try
#statement whether an exception occurs or not. IF an exception occurs, it is
#rethrown after the finally block code executes
try:
    raise KeyboardInterrupt
finally:
    print('Goodbye world is printed at the end of the try block.')
    print('This file ends in an exception as this is the last code in the\n',
          'file and its purpose is to demonstrate a finally block\n',
          'running when an exception is thrown')

#some objects define standard cleanup actions that execute whether an error.
#e.g. the with clause for files.
