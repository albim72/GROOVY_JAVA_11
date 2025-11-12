def maybe = null
def sizeSafe = maybe?.size()

def l1 = [1,2,3];def l2=[1,2,3];def l3=l1
def eq = (l1==l2)
def same = (l1.is(l3))

def cmp = 10 <=> 20
def rx = ("abc123" =~ /\d+/).find()

println(sizeSafe)
println(eq)
println(same)
println(cmp)
println(rx)
