import json

#
#Files
#
#basic read and write operations.
#with clause automatically closes file when complete. 
with open('workfile', 'w') as f:
    f.write('0123456789abcdef\nThis is line 2\nLine 3 is here!')
with open('workfile') as f:
    read_data = f.read()
    print(read_data)

#readline() reads a single line.
with open('workfile') as f:
    print('Line 1: ' + f.readline())
    print('Line 2: ' + f.readline())
    print('Line 3: ' + f.readline())

#Files can be looped over
with open('workfile') as f:
    for line in f:
        print('looping! ' + line, end='')

#writing lines into a file
with open('workfile', 'a') as f:
    f.write('This is a test\n')
    value = ('the answer', 42)
    s = str(value) #convert tuple to string
    f.write(s) #write new string to file.

#readlines() reads all lines and returns them as a list.
with open('workfile', 'r') as f:
    print('\n')
    print(f.readlines())

#seeking bytes and words in binary files
with open('workfilebinary', 'wb') as f:
    f.write(b'0123456789abcdef')
with open('workfilebinary', 'rb+') as f:
    
    f.seek(5) #goto 6th byte in the file
    print(f.read(1)) #read 1 byte starting at current position

    f.seek(-3, 2) #goto 3rd byte before the end
    print(f.read(1)) #read 1 byte at current position

#JSON
with open('workfilejson', 'w') as f:
    x = [1, 'simple', 'list']
    print(json.dumps(x)) #dump object as json to a string.
    json.dump(x, f) #write x as JSON to file f
with open('workfilejson', 'r') as f:
    thex = json.load(f) #create the object from the file f.
    print('Thex object equals', thex)
    
    
