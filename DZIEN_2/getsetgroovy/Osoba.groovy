class SPerson {
    int age

    int getAge() {
        println("GETTER_USED")
        return age
    }
}

def ps = new SPerson()
ps.age = 40
println(ps.age)

