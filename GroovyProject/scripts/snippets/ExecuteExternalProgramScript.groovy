
def process = ["calc.exe"].execute()
process.waitFor()


println process.exitValue()
println process.in.text
println process.err.text
