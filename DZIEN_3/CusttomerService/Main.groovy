class Main {
    static void main(String[] args) {
        def service = new CustomerService()

        println("___ dodawanie klientów ___")
        service.addCustomer("Leon","leon@firma.pl")
        service.addCustomer("Anna","anna@firma.pl")
        service.addCustomer("Jan","jan@firma.pl")
        service.addCustomer("Wanda","wanda@firma.pl")

        println("___ wysietlanie klientów ___")
        service.getAll().each {println(it)}

        println("___ aktywni klienci ___")
        service.getActive().each {println(it)}

        println("___ szukanie klienta o id = 2 ___")
        def c = service.findById(2L)
        println(c?:"Nie znaleziono")

        println("___ dezaktywacja klienta ___")
        def ok = service.deactivate(2L)
        println("Czy się udało? $ok")

        println("___ aktywni klienci ___")
        service.getActive().each {println(it)}


    }
}
