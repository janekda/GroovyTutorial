outputCatcher = new StringBuffer()
errorCatcher = new StringBuffer()
proc = "cmd /c dir".execute()
proc.consumeProcessOutput(outputCatcher, errorCatcher)
proc.waitFor()
println outputCatcher