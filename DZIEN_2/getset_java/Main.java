public class Main {
    public static void main(String[] args) {
        Person p = new Person("Jacek",34);
        p.setAge(25);
        System.out.println("Imię: " + p.getName() + ",wiek: " + p.getAge());
//        System.out.println(p.age); -> nie ma dosepu do age bo jest private
    }
}
