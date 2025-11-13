class Main{
    static void main(String[] args) {
        Order order = new Order(1560.00,"Marcin")
        println("Customer: ${order.customer}, amount: ${order.amount}")

        double totalWithVat = order.amount *1.23
        println("Cena z VAT: ${totalWithVat}")
    }
}
