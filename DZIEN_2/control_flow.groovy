def fizzBuzz = {
    n->
        (1..n).collect {
            if(it%15 == 0) "FizzBuzz"
            else if (it%3 == 0) "Fizz"
            else if (it%5 == 0) "Buzz"
            else it
        }
}

def typeOf = {
    x->
        switch (x){
            case Number: return "NUM"
            case String: return "STR"
            default: return "OTHER"
        }
}

println(fizzBuzz(16))
println(typeOf(12.3))
println(typeOf("ok"))
println(typeOf(true))
