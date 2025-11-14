package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static class Person {
        private final String name;
        private final int age;
        private final String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public String getCity() { return city; }

        @Override
        public String toString() {
            return name + " (" + age + "), " + city;
        }
    }

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
            new Person("Marcin", 52, "Kraków"),
            new Person("Ewa", 48, "Warszawa"),
            new Person("Adam", 30, "Gdańsk"),
            new Person("Ola", 17, "Kraków"),
            new Person("Piotr", 25, "Kraków")
        );

        // 1. Dorośli z Krakowa, posortowani po imieniu
        List<String> adultsFromKrakow = persons.stream()
                .filter(p -> p.getAge() >= 18)
                .filter(p -> "Kraków".equals(p.getCity()))
                .map(Person::getName)
                .sorted()
                .collect(Collectors.toList());

        // 2. Średni wiek w każdym mieście
        Map<String, Double> avgAgeByCity = persons.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.averagingInt(Person::getAge)
                ));

        // 3. Raport
        System.out.println("Dorośli z Krakowa (posortowani): " + adultsFromKrakow);

        System.out.println("Średni wiek w miastach:");
        for (Map.Entry<String, Double> e : avgAgeByCity.entrySet()) {
            System.out.println(" - " + e.getKey() + ": " + String.format(Locale.US, "%.1f", e.getValue()));
        }
    }
}
