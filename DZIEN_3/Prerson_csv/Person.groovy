class Person {
    String name
    int age
    String city
    
    String toString() {
        "$name ($age), $city"
    }
}

//GroovyBean - ne trzeba obudowywać pól get/set 
