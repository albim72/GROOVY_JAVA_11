def s = "Groovy is best Language"
def lower = s.toLowerCase()
def n = lower.size()

def evensSquared = [3,6,3,7,32,7,9,0,22,5,21,21,12].findAll{it%2==0}.collect{it*it}

def m = [a:1,b:7,c:3] //mapa - słownik

def keysGt1 = m.findAll {it.value>1}.collect {it.key}

println(lower)
println(n)
println(evensSquared)
println(keysGt1)

assert lower == "groovy is best language"
assert n == 23
assert evensSquared == [36, 1024, 0, 484, 144]
assert keysGt1 as Set == ['b', 'c'] as Set
