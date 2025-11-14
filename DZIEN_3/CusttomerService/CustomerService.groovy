class CustomerService {
    private List<Customer> customers = []
    private Long nextId = 1L

    /**
     * dodaj nowego klienta
     */
    Customer addCustomer(String name, String email){
        def c = new Customer(id: nextId++,name:  name,email: email,active: true)
        customers << c
        return c
    }
    /**
     * zwaraca litę wszystkich klientów
     */
    List<Customer> getAll() {
        customers
    }

    /**
     * szuka klienta po ID
     */
    
    Customer findById(Long id){
        customers.find {it.id == id}
    }

    /**
     * dezaktywuje klienta (soft delete)
     */
    boolean deactivate(Long id) {
        def c = findById(id)
        if (!c) return false
        c.active = false
        return true
    }

    /**
     * lista aktywnych klientów
     */
    
    List<Customer> getActive() {
        customers.findAll {it.active}
    }




}
