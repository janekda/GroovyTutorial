def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
assert roman[4] == 'IV'

roman[8] = 'VIII'
assert roman.size() == 9


myList = []

myList += 'a'
assert myList == ['a']

myList += ['b','c']
assert myList == ['a','b','c']

myList = []
myList <<  'a' << 'b'
assert myList == ['a','b']
assert myList - ['b'] == ['a']
assert myList * 2 == ['a','b','a','b']
