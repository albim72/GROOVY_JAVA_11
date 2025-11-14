import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path


class CsvFileService {
    /**
     * Zapisuje listę obiektów Person do pliku csv z nagłówkiem
     *
     */
    void writePersons(Path path, List<Person> persons) {
        def lines = []
        //nagłówek
        lines << "name;age;city"
        
        persons.each {p ->
            lines << "${p.name};${p.age};${p.city}"
        }
        Files.write(path,lines, StandardCharsets.UTF_8)
    }

    /**
     * Odczytuje plik csv i mapuje wiersze na obiekty Person
     */
    
    

}
