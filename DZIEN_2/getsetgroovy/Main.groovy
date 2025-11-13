def p = new Person()
p.name = "Karol"
p.age = 38

println("${p.name} - ${p.age}")

println(Person.methods*.name.sort().unique())
println(Person.metaClass.hasProperty(p,"age"))

