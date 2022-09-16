import Entities.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
             person.setName("Marcelo");
             String personName = person.getName();
        System.out.println(personName);
    }
}