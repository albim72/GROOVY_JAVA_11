def inc = {it +1}

def res1 = [1,2,3].collect(inc)

def absRef = Math.&abs
def res2 = [-3,-2,-52].collect(absRef)

def applyTwice = {x,f -> f(f(x))}
def res3 = applyTwice(3,inc)

println(res1)
println(res2)
println(res3)
