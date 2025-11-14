import java.nio.file.Path

class Main {
    static void main(String[] args) {
        def service = new CsvFileService()
        Path path = Path.of("persons.csv")

        def persons = [
                new Person(name:"Marcin",age:52,city:"Lublin"),
                new Person(name:"Ewa",age:49,city:"Lublin"),
                new Person(name:"Tomasz",age:28,city:"Warszawa"),
                new Person(name:"Alina",age:30,city:"Katowice"),
                new Person(name:"Nadia",age:43,city:"Gdańsk")
        ]

        println("___ zapis csv ___")
        service.writePersons(path,persons)

        println("___ odczyt csv ___")
        def readBack = service.readPersons(path)
        readBack.each {println(it)}
    }
}
