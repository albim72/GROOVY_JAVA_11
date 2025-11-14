class MainGroovy {
    static void main(String[] args) {
        def service = new XmlServiceGroovy()
        def inFile = new File("people.xml")
        def outFile = new File("people_groovy.xml")

        println("___ odczyt xml ___")
        def people = service.readPeople(inFile)
        people.each {println(it)}

        println("___ zapis xml ___")
        service.writePeople(outFile,people)
        println("Zapisano do $outFile.absolutePath")
    }
}
