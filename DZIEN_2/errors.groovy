def div = {a,b ->
    if (b==0) throw new IllegalArgumentException("b nie może być zerem")
    a/b
}

def errMsg = null
try {
    div(10,0)
}
catch (IllegalArgumentException e){
    errMsg =e.message
    println(errMsg)
}
finally {
    println("wykonano!")
}

assert errMsg == "b nie może być zerem"
