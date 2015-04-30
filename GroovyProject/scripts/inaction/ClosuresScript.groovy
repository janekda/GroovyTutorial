def i = 1

//with variable
[1, 2, 3].each { entry ->
    
    assert entry == i
    i++
}

def j = 1
//same but with default variable "it"
[1, 2, 3].each {
    assert it == j
    j++
}

def totalClinks = 0
def partyPeople = 100

1.upto(partyPeople) { guestNumber ->
    
    clinksWithGuest = guestNumber-1
    totalClinks += clinksWithGuest
}

assert totalClinks == (partyPeople*(partyPeople-1))/2

assert [a:1, b:2].collect { key, value -> key*value } == ["a", "bb"]
assert [3:20, 2:30].collect { entry -> entry.key * entry.value } == [60, 60]


//simplest calling closure
def adder = { x, y -> return x+y }
assert adder(4, 3) == 7
assert adder.call(2, 6) == 8

// ---------------------------------
// calling closure within method body
def benchmark(repeat, Closure worker){
    
    start = System.currentTimeMillis()
    repeat.times{worker(it)}
    stop = System.currentTimeMillis()
    return stop - start
}

Closure slowDividing = { (int) it / 2}

//ruzne zapisy volani closures
slow = benchmark(10000, slowDividing)
fast = benchmark(10000) { it.intdiv(2) }
assert fast * 3 < slow
// ---------------------------------

//react on parameters size in closure
def caller (Closure closure){
    closure.getParameterTypes().size()
}

assert caller { one -> }      == 1
assert caller { one, two -> } == 2
// ---------------------------------

//currying in closures - posílání méně parametrů, díky fcím
def minuser = {x, y -> return y-x}
def minusOne = minuser.curry(1)
assert minusOne(5) == 4