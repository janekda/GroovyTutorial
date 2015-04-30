me      = 'Tarzan'
you     = 'Jane'
line    = "me $me - you $you"
assert  line == 'me Tarzan - you Jane'

date = new Date(0)
out  = "Year $date.year Month $date.month Day $date.date"
assert out == 'Year 70 Month 0 Day 1'

out = "Date is ${date.toGMTString()} !"
assert out == 'Date is 1 Jan 1970 00:00:00 GMT !'

sql = """SELECT FROM MyTable WHERE Year = $date.year"""
assert sql == """SELECT FROM MyTable WHERE Year = 70"""

out = "my 0.02\$"
assert out == 'my 0.02$'


greeting = 'Hello Groovy!'
assert greeting.startsWith('Hello')
assert greeting.getAt(0) == 'H'
assert greeting[0]       == 'H'
assert greeting.indexOf('Groovy') >= 0
assert greeting.contains('Groovy')
assert greeting[6..11]  == 'Groovy'
assert 'Hi' + greeting - 'Hello' == 'Hi Groovy!'
assert greeting.count('o') == 3
assert 'x'.padLeft(3)      == '  x'
assert 'x'.padRight(3,'_') == 'x__'
assert 'x'.center(3)       == ' x '
assert 'x' * 3             == 'xxx'