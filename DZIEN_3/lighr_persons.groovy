package com.example.demo

class Person {
    String name
    int age
    String city

    String toString() {
        "$name ($age), $city"
    }
}

class Main {
    static void main(String[] args) {

        def persons = [
            new Person(name: "Marcin", age: 52, city: "Kraków"),
            new Person(name: "Ewa",    age: 48, city: "Warszawa"),
            new Person(name: "Adam",   age: 30, city: "Gdańsk"),
            new Person(name: "Ola",    age: 17, city: "Kraków"),
            new Person(name: "Piotr",  age: 25, city: "Kraków")
        ]

        // 1. Dorośli z Krakowa, posortowani po imieniu
        def adultsFromKrakow = persons
                .findAll { it.age >= 18 && it.city == "Kraków" }
                .sort { it.name }
                .collect { it.name }

        // 2. Średni wiek w każdym mieście
        def avgAgeByCity = persons
                .groupBy { it.city }
                .collectEntries { city, peopleInCity ->
                    def avg = peopleInCity*.age.sum() / peopleInCity.size()
                    [ (city): avg ]
                }

        // 3. Raport
        println "Dorośli z Krakowa (posortowani): $adultsFromKrakow"

        println "Średni wiek w miastach:"
        avgAgeByCity.each { city, avg ->
            println " - $city: ${String.format('%.1f', avg)}"
        }
    }
}
