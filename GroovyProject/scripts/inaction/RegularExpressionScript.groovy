assert "12345" =~ /\d+/

assert "xxx" == '123'.replaceAll(/\d/,'x')

assert "abc" == /abc/
assert "\\d" == /\d/

def reference = "hello"
assert reference == /$reference/
assert "\$" == /$/