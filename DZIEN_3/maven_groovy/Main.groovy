class Main {
    static void main(String[] args) {
        Validator.addRule(Person)  {p ->
            p.name?.size() > 2 && p.age >=18
        }

        Person.metaClass.isValid = { ->
            Validator.validate(delegate)
        }

        def p1 = new Person(name: "Marcin", age:52)
        def p2 = new Person(name: "Nadia", age:35)

        print(Validator.validate(p1))
        print("\n")
        print(Validator.validate(p2))

        println("_________________")
        println(p1.isValid())
        println(p2.isValid())
    }
}
