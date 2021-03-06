def x  = 1..10

assert x.contains(5)
assert x.contains(15) == false
assert x.size()    == 10
assert x.from      == 1
assert x.to        == 10
assert x.reverse() == 10..1


def min = 10
def max = 20
def newRange = min..<max
assert newRange.max() == 19

assert (0..10).contains(0)
assert (0..10).contains(5)
assert (0..10).contains(10)
                                       
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false
assert (0..<10).contains(9)
assert (0..<10).contains(10) == false
                                        
def a = 0..10
assert a instanceof Range
assert a.contains(5)
                                        
a = new IntRange(0,10)
assert a.contains(5)
                                              
assert (0.0..1.0).contains(0.5)
                               
def today     = new Date()
def yesterday = today-1
assert (yesterday..today).size() == 2
                     
assert ('a'..'c').contains('b')
                                        
def log = ''
for (element in 5..9){
    log += element
}
assert log == '56789'

log = ''
for (element in 9..5){
    log += element
}
assert log == '98765'

log = ''
(9..<5).each { element ->
    log += element
}
assert log == '9876'