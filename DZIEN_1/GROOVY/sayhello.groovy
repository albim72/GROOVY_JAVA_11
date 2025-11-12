def name = "Anna"

println("Hello Groovy!")
println("Hello , $name!")

String sayHi(who) {"Hi, $who!"}

println(sayHi("Jack"))

assert sayHi("Jack") == "Hi, Jack!"
