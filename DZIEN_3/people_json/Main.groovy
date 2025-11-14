import java.nio.file.Path

class Main{
    static void main(String[] args) {

        def service = new JsonService()
        Path path = Path.of("people.json")

        println("___ odczyt json ___")
        def people = service.readPeople(path)
        println(people)

        println("___ filtr json ___")
        def filtered =service.filterByAge(people,40)
        filtered.each {println("${it.name} (${it.age})")}

        println("___ dodanie nowej osoby ___")
        service.addPerson(people,[
                name:"Tomasz",
                age:66,
                city:"Poznań",
                hobbies:["Chess","Travel"]
        ])

        println("___ zapis do pliku json ___")
        Path npath = Path.of("npeople.json")
        service.writePeople(npath,people)
        println("Zapisano do pliku")
    }
}
